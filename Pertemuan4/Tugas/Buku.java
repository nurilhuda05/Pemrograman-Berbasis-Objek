package Tugas;
public class Buku {
    protected String judul;
    protected String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String info() {
        return "Judul: " + judul + ", Penulis: " + penulis;
    }
}

