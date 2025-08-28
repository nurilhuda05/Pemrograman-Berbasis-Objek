public class Printer {
    private String merek;
    private int statusTinta;

    public void setMerek(String newValue) {
        merek = newValue;
    }
    public void setStatusTinta(int status) {
        this.statusTinta = status;
    }
    public void printDokumen(String dok) {
        if(statusTinta > 0){
            System.out.println("Mencetak: " + dok);
            statusTinta--;
        } else {
            System.out.println("Tinta habis!");
        }
    }
    public void isiTinta(int newValue) {
        statusTinta += newValue;
        System.out.println("Tinta sudah diisi ulang!");
    }
    public void scan(String dok) {
        System.out.println(dok+" Berhasil Discan");
    }
    public void cetakInfo() {
        System.out.println("Printer jenis: " +merek);
        System.out.println("Sisa tinta: " + statusTinta);
    }
}
