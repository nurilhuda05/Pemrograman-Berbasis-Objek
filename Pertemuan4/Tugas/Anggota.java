package Tugas;
public class Anggota {
    private String nama;
    private String id;
    public Anggota(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }
    public void pinjamBuku(Buku buku) {
        System.out.println(nama + " meminjam: " + buku.info());
        System.out.println();
    }
}
