
public class TestPeminjaman {
    public static void main(String[] args) {
        // Membuat objek peminjaman
        Peminjaman pj1 = new Peminjaman();
        pj1.id = "M001";
        pj1.namaMember = "Andi";
        pj1.namaGame = "FIFA 24";
        pj1.hargaSewa = 15000; // harga sewa per hari
        pj1.lamaSewa = 3;      // lama sewa dalam hari

        // Menampilkan data
        pj1.tampilData();
    }
}
