public class Demo {
    public static void main(String[] args) {
        // Laptop
        Laptop l1 = new Laptop();
        l1.setMerek("Asus");
        l1.setRam(16);
        l1.cetakInfo();
        l1.nyalakan();
        l1.upgradeRam(8);
        l1.cetakInfo();
        l1.matikan();

        System.out.println();

        // Printer
        Printer p1 = new Printer();
        p1.setMerek("Cannon");
        p1.setStatusTinta(2);
        p1.cetakInfo();
        p1.printDokumen("Laporan OOP");
        p1.scan("Piagam");;
        p1.isiTinta(3);
        p1.cetakInfo();

        System.out.println();

        // SepatuOlahraga
        SepatuOlahraga s1 = new SepatuOlahraga();
        s1.setMerek("Nike");
        s1.setUkuran(42);
        s1.setJenisOlahraga("Lari");
        s1.setBahan("Kanvas");
        s1.cetakInfo();
        s1.pakai();
        s1.lariCepat();
        s1.lompat();
        s1.latihan();
        s1.lepas();
        s1.simpan();

        System.out.println();

        // SepatuCasuals
        SepatuCasuals s2 = new SepatuCasuals();
        s2.setMerek("Adidas");
        s2.setUkuran(40);
        s2.setWarna("Hitam");
        s2.setJenisTali("Velcro");
        s2.cetakInfo();
        s2.pakai();
        s2.jalanSantai();
        s2.pakaiDiPantai();
        s2.tahanAir();
        s2.lepas();
        s2.simpan();
    }
}
