public class TestBarang2 {
    public static void main(String[] args) {
        Barang2 brg1 = new Barang2();

        // Set nilai atribut
        brg1.kode = "BRG001";
        brg1.namaBarang = "Laptop Asus";
        brg1.hargaDasar = 10000000; // 10 juta
        brg1.diskon = 0.10f; // 10% (pakai pecahan desimal)

        // Tampilkan data barang
        brg1.tampilData();
    }
}
