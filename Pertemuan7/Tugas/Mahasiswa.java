package Tugas;

public class Mahasiswa extends Manusia {
    // Overriding method makan()
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan di kantin kampus.");
    }

    public void tidur() {
        System.out.println("Mahasiswa tidur setelah belajar semalaman.");
    }
}
