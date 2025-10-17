package Tugas;

public class Dosen extends Manusia {
    // Overriding method makan()
    @Override
    public void makan() {
        System.out.println("Dosen makan sambil memeriksa tugas mahasiswa.");
    }

    public void lembur() {
        System.out.println("Dosen lembur untuk menyiapkan materi kuliah.");
    }
}
