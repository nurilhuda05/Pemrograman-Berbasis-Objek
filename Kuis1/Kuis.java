// Kuis.java
// Turunan dari Konten, berisi soal-soal yang bisa dikerjakan peserta

import java.util.Scanner;

public class Kuis extends Konten {
    private String[] soal;
    private String[] jawabanBenar;

    public Kuis(String judul, int durasi, String[] soal, String[] jawabanBenar) {
        super(judul, durasi);
        this.soal = soal;
        this.jawabanBenar = jawabanBenar;
    }

    public int kerjakanKuis(Scanner sc) {
        int skor = 0;
        System.out.println("=== Kuis: " + judul + " ===");
        for (int i = 0; i < soal.length; i++) {
            System.out.println((i + 1) + ". " + soal[i]);
            System.out.print("Jawaban: ");
            String jawaban = sc.nextLine().trim();
            if (jawaban.equalsIgnoreCase(jawabanBenar[i])) {
                skor++;
            }
        }
        System.out.println("Skor akhir: " + skor + " dari " + soal.length);
        return skor;
    }
}
