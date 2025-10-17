package Tugas;

public class Main {
    public static void main(String[] args) {
        // Buat objek daftar gaji dengan kapasitas 3
        DaftarGaji daftar = new DaftarGaji(3);

        // Buat objek Dosen
        Dosen d1 = new Dosen("001", "Budi", "Jakarta");
        d1.setSKS(12);

        Dosen d2 = new Dosen("002", "Ani", "Bandung");
        d2.setSKS(9);

        // Tambahkan dosen ke daftar gaji
        daftar.addPegawai(d1);
        daftar.addPegawai(d2);

        // Cetak daftar gaji
        daftar.printSemuaGaji();
    }
}
