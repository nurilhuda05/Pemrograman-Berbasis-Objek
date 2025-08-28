public class SepatuOlahraga extends Sepatu {
    private String jenisOlahraga;
    private String bahan;

    public void setJenisOlahraga(String newValue) {
        jenisOlahraga = newValue;
    }
    public void setBahan(String newValue) {
        bahan = newValue;
    }
    public void lariCepat() {
        System.out.println("Sepatu " +merek + " Digunakan Untuk Lari Cepat");
    }
    public void lompat() {
        System.out.println("Sepatu " +merek + " Digunakan Untuk Melompat");
    }
    public void latihan() {
        System.out.println("Sepatu " +merek + " Dipakai Untuk Latihan " + jenisOlahraga);
    }
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis Olahraga: " + jenisOlahraga);
        System.out.println("Bahan: " + bahan);
    }
}