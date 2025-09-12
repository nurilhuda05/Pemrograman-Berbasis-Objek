
public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public double hargaSewa;
    public int lamaSewa;

    // Method untuk menampilkan data
    public void tampilData() {
        System.out.println("ID Member     : " + id);
        System.out.println("Nama Member   : " + namaMember);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Harga Sewa    : " + hargaSewa);
        System.out.println("Lama Sewa     : " + lamaSewa + " hari");
        System.out.println("Total Bayar   : " + hitungHarga());
    }

    // Method untuk menghitung total harga
    public double hitungHarga() {
        return lamaSewa * hargaSewa;
    }
}
