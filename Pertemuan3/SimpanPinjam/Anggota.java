package SimpanPinjam;
public class Anggota {
    String noKTP;
    String nama;
    int limitPeminjaman;
    int jumlahPinjaman;
    Anggota(String noKTP, String nama, int limitPeminjaman ){
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limitPeminjaman;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    public void pinjam(int uang){
        if (uang < limitPeminjaman){
            jumlahPinjaman += uang;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
    }
    public void angsur(int uang){
        if (uang > jumlahPinjaman) {
            jumlahPinjaman = 0; 
        } else if(uang < (0.1*jumlahPinjaman) ){
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }
        else {
            jumlahPinjaman -= uang;
        }
    }
}
