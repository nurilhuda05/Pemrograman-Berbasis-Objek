package SimpanPinjam;
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota ("111333444", "Donny", 10000000);

        System.out.println("Nama Anggota: "+donny.getNama());
        System.out.println("Limit Pinjaman: "+donny.limitPeminjaman);

        //Meminjam Pertama
        System.out.print("\nMasukkan jumlah pinjaman: ");
        int pinjaman = sc.nextInt();
        donny.pinjam(pinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // Meminjam Kedua
        System.out.print("\nMasukkan jumlah pinjaman: ");
        pinjaman = sc.nextInt();
        donny.pinjam(pinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // Angsuran pertama
        System.out.print("\nMasukkan jumlah angsuran: ");
        int angsuran = sc.nextInt();
        donny.angsur(angsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // Angsuran kedua
        System.out.print("\nMasukkan jumlah angsuran: ");
        angsuran = sc.nextInt();
        donny.angsur(angsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

    }
}
