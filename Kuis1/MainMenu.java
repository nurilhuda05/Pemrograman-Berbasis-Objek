// MainMenu.java
// Program utama dengan menu interaktif
// Menyediakan fitur: daftar peserta, pilih kursus, pembayaran, akses konten, kerjakan kuis, cetak sertifikat

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Peserta peserta = null;
        Kursus kursus = null;
        Pembayaran pembayaran = null;

        // Buat konten untuk kursus
        Video v1 = new Video("Belajar Java", 60, "1080p");
        Artikel a1 = new Artikel("Konsep OOP", 30, 1200);
        String[] soal = {"Apa kepanjangan OOP?", "Keyword untuk membuat class di Java?", "Tipe data untuk bilangan pecahan?"};
        String[] jawaban = {"Object Oriented Programming", "class", "double"};
        Kuis k1 = new Kuis("Latihan OOP", 15, soal, jawaban);

        Konten[] kontenJava = {v1, a1, k1};
        Kursus kursusJava = new Kursus("Pemrograman Java", "Belajar dasar hingga OOP", kontenJava);

        boolean running = true;
        while (running) {
            System.out.println("\n=== MENU STARTUP EDUTECH ===");
            System.out.println("1. Daftar Peserta");
            System.out.println("2. Pilih Kursus");
            System.out.println("3. Lakukan Pembayaran");
            System.out.println("4. Akses Konten Kursus");
            System.out.println("5. Kerjakan Kuis");
            System.out.println("6. Cetak Sertifikat");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int menu = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan email: ");
                    String email = sc.nextLine();
                    peserta = new Peserta(nama, email);
                    System.out.println("Peserta berhasil terdaftar!");
                    peserta.tampilkanInfo();
                    break;

                case 2:
                    if (peserta == null) {
                        System.out.println("Daftarkan diri terlebih dahulu!");
                        break;
                    }
                    kursus = kursusJava;
                    System.out.println("Anda telah memilih kursus: " + kursus.getNama());
                    kursus.tampilkanInfo();
                    pembayaran = new Pembayaran(500000);
                    break;

                case 3:
                    if (kursus == null) {
                        System.out.println("Pilih kursus terlebih dahulu!");
                        break;
                    }
                    if (pembayaran != null) {
                        pembayaran.lakukanPembayaran(sc);
                    }
                    break;

                case 4:
                    if (peserta == null || kursus == null || pembayaran == null || !pembayaran.isLunas()) {
                        System.out.println("Anda harus daftar, pilih kursus, dan bayar terlebih dahulu!");
                        break;
                    }
                    kursus.tampilkanInfo();
                    break;

                case 5:
                    if (kursus == null || pembayaran == null || !pembayaran.isLunas()) {
                        System.out.println("Anda belum bisa mengakses kuis. Lengkapi pembayaran dulu!");
                        break;
                    }
                    for (Konten k : kursus.getDaftarKonten()) {
                        if (k instanceof Kuis) {
                            ((Kuis) k).kerjakanKuis(sc);
                        }
                    }
                    break;

                case 6:
                    if (peserta == null || kursus == null || pembayaran == null || !pembayaran.isLunas()) {
                        System.out.println("Sertifikat tidak bisa dicetak. Selesaikan pendaftaran dan pembayaran!");
                        break;
                    }
                    System.out.println("=== SERTIFIKAT KURSUS ===");
                    System.out.println("Nama: " + peserta);
                    System.out.println("Kursus: " + kursus.getNama());
                    System.out.println("Status: LULUS");
                    System.out.println("=========================");
                    break;

                case 0:
                    running = false;
                    System.out.println("Terima kasih telah menggunakan platform ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        sc.close();
    }
}
