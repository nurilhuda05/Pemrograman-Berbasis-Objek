// Pembayaran.java
// Menyimpan data pembayaran kursus, bisa memilih metode tunai atau non-tunai

import java.util.Scanner;

public class Pembayaran {
    private double jumlah;
    private String metode;
    private boolean status;

    public Pembayaran(double jumlah) {
        this.jumlah = jumlah;
        this.status = false;
    }

    public void lakukanPembayaran(Scanner sc) {
        System.out.println("Pilih metode pembayaran: ");
        System.out.println("1. Tunai");
        System.out.println("2. Non-Tunai (Transfer/QRIS)");
        System.out.print("Pilihan: ");
        int pilihan = sc.nextInt();
        sc.nextLine(); // buang newline

        if (pilihan == 1) {
            metode = "Tunai";
        } else {
            metode = "Non-Tunai";
        }

        status = true;
        System.out.println("Pembayaran sebesar Rp " + jumlah + " berhasil dengan metode " + metode);
    }

    public boolean isLunas() {
        return status;
    }
}
