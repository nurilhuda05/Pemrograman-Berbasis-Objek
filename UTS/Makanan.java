import java.util.Map;

// Kelas Makanan menyimpan data menu seperti nama, harga, bahan, dan waktu masak
public class Makanan {
    private String nama;
    private int harga;
    private Map<String,Integer> bahan; // bahan dan jumlah yang dibutuhkan
    private int waktuMasak;

    // Konstruktor untuk menginisialisasi atribut makanan
    public Makanan(String nama, int harga, Map<String,Integer> bahan, int waktuMasak){
        this.nama = nama;
        this.harga = harga;
        this.bahan = bahan;
        this.waktuMasak = waktuMasak;
    }

    public String getNama(){ return nama; }
    public int getHarga(){ return harga; }
    public Map<String,Integer> getBahan(){ return bahan; }
    public int getWaktuMasak(){ return waktuMasak; }

    @Override
    public String toString(){
        return nama + " - Rp " + harga + " (" + waktuMasak + " detik masak)";
    }
}
