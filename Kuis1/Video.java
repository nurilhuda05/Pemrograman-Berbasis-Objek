// Video.java
// Turunan dari Konten, khusus untuk konten berupa video

public class Video extends Konten {
    private String resolusi;

    public Video(String judul, int durasi, String resolusi) {
        super(judul, durasi);
        this.resolusi = resolusi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Video: " + judul + ", Durasi: " + durasi + " menit, Resolusi: " + resolusi);
    }
}
