// Kelas Pesanan mewakili transaksi antara pelanggan dan restoran
public class Pesanan {
    private Makanan makanan;
    private int jumlah;
    private Pelanggan pelanggan;
    private boolean sudahDibayar = false;

    // Konstruktor pesanan
    public Pesanan(Makanan makanan, int jumlah, Pelanggan pelanggan){
        this.makanan = makanan;
        this.jumlah = jumlah;
        this.pelanggan = pelanggan;
    }

    // Menghitung total harga pesanan
    public int totalHarga(){
        return makanan.getHarga() * jumlah;
    }

    public Makanan getMakanan(){ 
        return makanan; 
    }
    public int getJumlah(){ return jumlah; }
    public Pelanggan getPelanggan(){ return pelanggan; }

    public boolean isDibayar(){ return sudahDibayar; }
    public void setDibayar(boolean dibayar){ this.sudahDibayar = dibayar; }
}
