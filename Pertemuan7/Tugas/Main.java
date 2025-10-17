package Tugas;

public class Main {
    public static void main(String[] args) {
        Segitiga segi = new Segitiga();

        System.out.println("Total sudut (1 sudut diketahui): " + segi.totalSudut(60));
        System.out.println("Total sudut (2 sudut diketahui): " + segi.totalSudut(60, 40));
        System.out.println("Keliling segitiga (3 sisi): " + segi.keliling(3, 4, 5));
        System.out.println("Sisi miring segitiga siku-siku: " + segi.keliling(3, 4));
    }
}
