import java.util.*;

// Kelas Inventory mengelola stok bahan makanan di restoran
public class Inventory {
    private Map<String,Integer> stok = new HashMap<>();

    // Menambah stok bahan tertentu
    public void tambahStok(String nama, int jumlah){
        stok.put(nama, stok.getOrDefault(nama,0) + jumlah);
        System.out.println("Stok " + nama + " sekarang: " + stok.get(nama));
    }

    // Menggunakan bahan saat memasak
    public boolean pakaiBahan(Map<String,Integer> bahan, int jumlah){
        // Cek apakah stok cukup
        for (String b : bahan.keySet()){
            int butuh = bahan.get(b) * jumlah;
            if (stok.getOrDefault(b,0) < butuh) return false;
        }

        // Jika cukup, kurangi stok
        for (String b : bahan.keySet()){
            stok.put(b, stok.get(b) - bahan.get(b)*jumlah);
        }
        return true;
    }

    // Menampilkan semua stok bahan
    public void tampilkanStok(){
        System.out.println("--- STOK BAHAN ---");
        for (var e : stok.entrySet())
            System.out.println(e.getKey() + " : " + e.getValue());
    }
}
