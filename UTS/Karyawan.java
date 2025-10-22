// Kelas abstrak Karyawan sebagai induk dari Koki dan Pelayan
public abstract class Karyawan implements Pembersih {
    protected String nama; // nama karyawan
    protected int skill;   // tingkat kemampuan

    // Konstruktor untuk inisialisasi atribut dasar
    public Karyawan(String nama, int skill){
        this.nama = nama;
        this.skill = skill;
    }

    // Method abstrak: tiap karyawan punya cara bekerja berbeda
    public abstract void bekerja(Restoran resto, Pesanan pesanan);

    public String getNama(){ return nama; }
}
