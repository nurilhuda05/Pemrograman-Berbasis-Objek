public class SepatuCasuals extends Sepatu {
    private String warna;
    private String jenisTali;

    public void setWarna(String newValue) {
        warna = newValue;
    }
    public void setJenisTali(String newValue) {
        jenisTali = newValue;
    }
    public void jalanSantai() {
        System.out.println("Sepatu" +merek + " Digunakan Untuk Jalan Santai");
    }
    public void pakaiDiPantai() {
        System.out.println("Sepatu" +merek + " Cocok Dipakai Di Pantai");
    }
    public void tahanAir() {
        System.out.println("Sepatu" +merek + " Tahan Terhadap Air");
    }
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Warna: " + warna);
        System.out.println("Jenis Tali: " + jenisTali);
    }
}
