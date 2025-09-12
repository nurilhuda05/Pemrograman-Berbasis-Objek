public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran ling1 = new Lingkaran();
        ling1.phi = 3.14;  // konstanta phi
        ling1.r = 7;       // jari-jari lingkaran

        System.out.println("Jari-jari       : " + ling1.r);
        System.out.println("Luas Lingkaran  : " + ling1.hitungLuas());
        System.out.println("Keliling Lingkaran : " + ling1.hitungKeliling());
    }
}
