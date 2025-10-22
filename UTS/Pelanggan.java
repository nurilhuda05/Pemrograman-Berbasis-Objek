// Kelas Pelanggan menyimpan informasi tentang pembeli restoran
public class Pelanggan {
    private String nama;
    private String preferensi;
    private int kesabaran;
    private int kepuasan;

    public Pelanggan(String nama, String preferensi, int kesabaran){
        this.nama = nama;
        this.preferensi = preferensi;
        this.kesabaran = kesabaran;
        this.kepuasan = 100; // nilai awal kepuasan
    }

    public String getNama(){ return nama; }
    public String getPreferensi(){ return preferensi; }
    public int getKesabaran(){ return kesabaran; }
    public int getKepuasan(){ return kepuasan; }

    // Mengubah nilai kepuasan pelanggan (+/-)
    public void ubahKepuasan(int delta){
        kepuasan = Math.max(0, Math.min(100, kepuasan + delta));
    }

    @Override
    public String toString(){
        return nama + " (pref: " + preferensi + ", sabar: " + kesabaran + ")";
    }
}
