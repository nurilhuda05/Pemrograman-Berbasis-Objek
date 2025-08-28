public class Laptop {
    private String merek;
    private int ram;

    public void setMerek(String newValue){
        merek= newValue;
    }
    public void setRam(int newValue){
        ram = newValue;
    }
    public void nyalakan(){
        System.out.println("Laptop "+merek+" Dinyalakan");
    }
    public void matikan(){
        System.out.println("Laptop "+merek+" Dimatikan");
    }
    public void upgradeRam(int tambahan){
        ram += tambahan;
        System.out.println("Ram ditambah, sekarang: "+ram+" GB");
    }
    public void cetakInfo(){
        System.out.println("Laptop Merek: "+merek);
        System.out.println("Ram: "+ram+" GB");
    }
}
