package Tugas;
public class BukuPelajaran extends Buku {
    private String mataPelajaran;

    public BukuPelajaran(String judul, String penulis, String mataPelajaran) {
        super(judul, penulis);
        this.mataPelajaran = mataPelajaran;
    }
    public String info() {
        return super.info() + ", Mata Pelajaran: " + mataPelajaran;
    }
}

