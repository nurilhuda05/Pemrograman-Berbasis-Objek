// Kelas Koki adalah turunan dari Karyawan
// Bertanggung jawab untuk memasak makanan
public class Koki extends Karyawan implements Pemeliharaan {
    public Koki(String nama, int skill){ super(nama, skill); }

    @Override
    public void bekerja(Restoran resto, Pesanan pesanan){
        Makanan m = pesanan.getMakanan();

        // Mengecek apakah bahan cukup sebelum memasak
        if (!resto.getInventory().pakaiBahan(m.getBahan(), pesanan.getJumlah())) {
            System.out.println("[Koki " + nama + "] Bahan tidak cukup untuk " + m.getNama());
            return;
        }

        // Lama memasak dipengaruhi skill
        int waktu = Math.max(1, m.getWaktuMasak() - skill/3);
        System.out.println("[Koki " + nama + "] Memasak " + m.getNama() + " (" + waktu + " detik)");

        // Memanggil restoran untuk menandai bahwa masakan selesai
        resto.selesaikanMasak(pesanan);
    }

    @Override
    public String toString(){
        return "Koki: " + nama + " (skill " + skill + ")";
    }

    @Override
    public void bersihkanArea() {
        System.out.println("Koki dapat membersihkan dapur");
    }
}
