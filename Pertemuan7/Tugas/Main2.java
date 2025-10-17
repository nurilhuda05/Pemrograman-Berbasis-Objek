package Tugas;

public class Main2 {
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        Manusia manusia1; // referensi superclass

        // Referensi menunjuk ke objek Dosen
        manusia1 = new Dosen();
        manusia1.bernafas();  // memanggil method dari Manusia
        manusia1.makan();     // memanggil method dari Dosen (override)
        ((Dosen) manusia1).lembur(); // Casting ke Dosen agar bisa panggil lembur()

        System.out.println(); 

        // Referensi menunjuk ke objek Mahasiswa
        manusia1 = new Mahasiswa();
        manusia1.bernafas();  // memanggil method dari Manusia
        manusia1.makan();     // memanggil method dari Mahasiswa (override)
        ((Mahasiswa) manusia1).tidur();   // Casting ke Mahasiswa agar bisa panggil tidur()
    }
}
