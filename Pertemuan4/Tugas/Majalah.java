package Tugas;
public class Majalah extends Buku {
    private String edisi;

    public Majalah(String judul, String penulis, String edisi) {
        super(judul, penulis);
        this.edisi = edisi;
    }
    public String info() {
        return super.info() + ", Edisi: " + edisi;
    }
}

