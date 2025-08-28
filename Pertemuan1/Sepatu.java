public class Sepatu {
    protected String merek;
    protected int ukuran;

    public void setMerek(String newValue) {
        merek = newValue;
    }
    public void setUkuran(int newValue) {
        ukuran = newValue;
    }
    public void pakai() {
        System.out.println("Sepatu "+merek + " Dipakai");
    }
    public void lepas() {
        System.out.println("Sepatu "+merek + " Dilepas");
    }
    public void simpan() {
        System.out.println("Sepatu "+merek + " Disimpan Di Rak");
    }
    public void cetakInfo() {
        System.out.println("Sepatu Merek: " + merek);
        System.out.println("Ukuran: " + ukuran);
    }
}
