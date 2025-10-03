// Kursus.java
// Merepresentasikan kursus yang memiliki daftar konten pembelajaran

public class Kursus {
    private String nama;
    private String deskripsi;
    private Konten[] daftarKonten;

    public Kursus(String nama, String deskripsi, Konten[] daftarKonten) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.daftarKonten = daftarKonten;
    }

    public void tampilkanInfo() {
        System.out.println("Kursus: " + nama + " - " + deskripsi);
        System.out.println("Daftar Konten:");
        for (Konten k : daftarKonten) {
            k.tampilkanInfo();
        }
    }

    public Konten[] getDaftarKonten() {
        return daftarKonten;
    }

    public String getNama() {
        return nama;
    }
}
