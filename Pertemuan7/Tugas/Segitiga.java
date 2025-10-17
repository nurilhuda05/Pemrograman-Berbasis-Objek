package Tugas;

public class Segitiga {
    private int sudut; // atribut untuk menyimpan sudut

    // Method pertama: menghitung total sudut dari 1 sudut yang diketahui
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    // Method kedua (overloading): menghitung total sudut dari 2 sudut yang diketahui
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    // Method ketiga: menghitung keliling dengan 3 sisi
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Method keempat (overloading): menghitung sisi miring segitiga siku-siku
    public double keliling(int sisiA, int sisiB) {
        // Menggunakan teorema Pythagoras: c = √(a² + b²)
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }
}
