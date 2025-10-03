package Tugas;
public class RakBuku {
    private String kode;
    private Buku[] daftarBuku;

    public RakBuku (String kode, int kapasitas){
        this.kode = kode;
        this.daftarBuku = new Buku[kapasitas];
    } 
    public void tambahBuku(Buku buku, int posisi) {
        if (daftarBuku[posisi] == null) {
            daftarBuku[posisi] = buku;
        } else {
            System.out.println("Posisi rak sudah terisi!");
        }
    }
    public String info() {
        String info = "Rak " + kode + ":\n";
        for (Buku buku : daftarBuku) {
            if (buku != null) {
                info += "- " + buku.info() + "\n";
            }
        }
        return info;
    }
}
