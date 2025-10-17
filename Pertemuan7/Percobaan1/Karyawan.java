package Percobaan1;

/**
 * Kelas Karyawan merepresentasikan data seorang karyawan.
 * Kelas ini mencakup informasi dasar seperti nama, NIP, golongan, dan gaji.
 * Konsep yang digunakan di sini adalah Enkapsulasi, di mana data (atribut)
 * bersifat private dan hanya bisa diakses melalui method publik (Getter dan Setter).
 */
public class Karyawan {
    private String nama;
    private String nip;
    private String golongan;
    private double gaji;
    // Method setter digunakan untuk mengatur atau mengubah nilai atribut.
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public void setGolongan(String golongan) {
        this.golongan = golongan;
        // Struktur switch case digunakan untuk menentukan gaji berdasarkan karakter pertama dari golongan.
        switch (golongan.charAt(0)) {
            case '1': 
                this.gaji = 5000000;
                break; 
            case '2': 
                this.gaji = 3000000;
                break;
            case '3': 
                this.gaji = 2000000;
                break;
            case '4': 
                this.gaji = 1000000;
                break;
            case '5': 
                this.gaji = 750000;
                break;
        }
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    // Method getter digunakan untuk mengambil atau mendapatkan nilai atribut.
    public String getNama() {
        return nama;
    }
    public String getNip() {
        return nip;
    }
    public String getGolongan() {
        return golongan;
    }
    public double getGaji() {
        return gaji;
    }
}
