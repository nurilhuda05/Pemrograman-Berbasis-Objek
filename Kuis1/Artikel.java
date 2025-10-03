// Artikel.java
// Turunan dari Konten, khusus untuk konten berupa artikel

public class Artikel extends Konten {
    private int jumlahKata;

    public Artikel(String judul, int durasi, int jumlahKata) {
        super(judul, durasi);
        this.jumlahKata = jumlahKata;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Artikel: " + judul + ", Panjang: " + jumlahKata + " kata");
    }
}
