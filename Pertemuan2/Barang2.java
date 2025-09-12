public class Barang2 {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    // Method untuk menghitung harga jual
    int hitungHargaJual() {
        int hargaJual = (int) (hargaDasar - (diskon * hargaDasar));
        return hargaJual;
    }

    // Method untuk menampilkan data
    void tampilData() {
        System.out.println("Kode Barang   : " + kode);
        System.out.println("Nama Barang   : " + namaBarang);
        System.out.println("Harga Dasar   : Rp " + hargaDasar);
        System.out.println("Diskon        : " + (diskon * 100) + " %");
        System.out.println("Harga Jual    : Rp " + hitungHargaJual());
    }
}
