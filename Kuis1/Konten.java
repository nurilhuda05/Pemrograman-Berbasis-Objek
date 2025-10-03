// Konten.java
// Superclass untuk semua jenis konten pembelajaran (video, artikel, kuis)

public class Konten {
    protected String judul;
    protected int durasi;

    public Konten(String judul, int durasi) {
        this.judul = judul;
        this.durasi = durasi;
    }

    public void tampilkanInfo() {
        System.out.println("Konten: " + judul + " (" + durasi + " menit)");
    }
}
