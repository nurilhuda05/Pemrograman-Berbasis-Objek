// Kelas Pelayan adalah turunan dari Karyawan
// Selain melayani pelanggan, juga bisa membersihkan area
public class Pelayan extends Karyawan  {
    public Pelayan(String nama, int skill){ super(nama, skill); }

    @Override
    public void bekerja(Restoran resto, Pesanan pesanan){
        // Pelayan menyajikan makanan ke pelanggan
        System.out.println("[Pelayan " + nama + "] Menyajikan ke " + pesanan.getPelanggan().getNama());
        resto.sajikan(pesanan);
    }

    @Override
    public void bersihkanArea(){
        // Pelayan membersihkan area setelah melayani
        System.out.println("Pelayan " + nama + " Membersihkan area restoran.");
    }

    @Override
    public String toString(){
        return "Pelayan: " + nama + " (skill " + skill + ")";
    }
}
