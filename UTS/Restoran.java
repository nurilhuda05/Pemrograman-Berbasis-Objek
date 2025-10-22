import java.util.*;

// Kelas utama yang mewakili restoran
// Mengelola keuangan, karyawan, menu, stok bahan, dan pelanggan
public class Restoran {
    private String nama; // nama restoran
    private int uang; // jumlah uang restoran
    private int reputasi; // reputasi restoran
    private List<Makanan> menu = new ArrayList<>(); // daftar menu makanan
    private List<Karyawan> karyawans = new ArrayList<>(); // daftar karyawan
    private Inventory inventory = new Inventory(); // stok bahan
    private Random rand = new Random(); // untuk simulasi pelanggan acak

    // Konstruktor restoran
    public Restoran(String nama, int uangAwal){
        this.nama = nama;
        this.uang = uangAwal;
        this.reputasi = 75; // reputasi awal
    }

    // Mengambil objek inventory
    public Inventory getInventory(){ 
        return inventory; 
    }

    // Menambahkan makanan baru ke menu
    public void tambahMakanan(Makanan m){ 
        menu.add(m); 
    }

    // Menampilkan semua menu makanan
    public void tampilkanMenu(){
        System.out.println("--- MENU ---");
        for (int i=0;i<menu.size();i++)
            System.out.println((i+1)+". "+menu.get(i));
    }

    // Menambahkan karyawan baru
    public void tambahKaryawan(Karyawan k){
        karyawans.add(k);
        System.out.println("Tambah karyawan: "+k);
    }

    // Menampilkan daftar semua karyawan
    public void lihatKaryawan(){
        System.out.println("\n=== DAFTAR KARYAWAN ===");
        if (karyawans.isEmpty())
            System.out.println("Belum ada karyawan.");
        for (Karyawan k : karyawans)
            System.out.println(k.toString());
    }

    // Pemesanan manual dari pengguna
    public void pemesananManual(Scanner sc){
        System.out.print("Nama pelanggan: ");
        String nama = sc.nextLine();
        tampilkanMenu();
        System.out.print("Pilih nomor menu: ");
        int idx = Integer.parseInt(sc.nextLine())-1;
        if (idx<0 || idx>=menu.size()) {
            System.out.println("Menu tidak valid.");
            return;
        }
        Makanan m = menu.get(idx);
        System.out.print("Jumlah porsi: ");
        int jml = Integer.parseInt(sc.nextLine());
        Pelanggan p = new Pelanggan(nama, m.getNama(), 5);
        Pesanan ps = new Pesanan(m,jml,p);
        prosesPesanan(ps);
    }

    // Proses pesanan dilakukan oleh koki dan pelayan
    private void prosesPesanan(Pesanan ps){
        Koki koki = null; 
        Pelayan pelayan = null;

        // Mencari karyawan sesuai jenisnya
        for (Karyawan k : karyawans){
            if (k instanceof Koki && koki==null) koki=(Koki)k;
            if (k instanceof Pelayan && pelayan==null) pelayan=(Pelayan)k;
        }

        if (koki==null){
            System.out.println("Tidak ada koki!");
            return;
        }

        // Koki memasak
        koki.bekerja(this, ps);

        // Pelayan menyajikan
        if (pelayan!=null) pelayan.bekerja(this, ps);

        // Setelah selesai, pelanggan membayar
        prosesPembayaran(ps);
    }

    // Dipanggil saat masakan selesai dimasak
    public void selesaikanMasak(Pesanan ps){
        System.out.println("[Restoran] " + ps.getMakanan().getNama() + " siap disajikan!");
    }

    // Pelayan menyajikan makanan ke pelanggan
    public void sajikan(Pesanan ps){
        System.out.println("[Restoran] Menyajikan ke pelanggan " + ps.getPelanggan().getNama());
    }

    // Proses pembayaran dari pelanggan
    public void prosesPembayaran(Pesanan ps){
        int bayar = ps.totalHarga();
        uang += bayar; // menambah uang ke kas restoran
        ps.setDibayar(true);
        System.out.println("[Pembayaran] Pelanggan membayar Rp " + bayar + ". Saldo: Rp " + uang);
    }

    // Simulasi pelanggan datang secara acak
    public void mulaiSimulasi(int pelanggan){
        for (int i=0; i<pelanggan; i++){
            if (rand.nextBoolean()){
                Pelanggan p = new Pelanggan("Pelanggan"+(i+1), null, rand.nextInt(10)+1);
                Makanan m = menu.get(rand.nextInt(menu.size()));
                Pesanan ps = new Pesanan(m,1,p);
                System.out.println("\n[Pelanggan datang] " + p.getNama());
                prosesPesanan(ps);
            }
        }
    }

    // Menampilkan laporan restoran
    public void laporanSingkat(){
        System.out.println("\n=== LAPORAN ===");
        System.out.println("Restoran: "+nama);
        System.out.println("Saldo: Rp "+uang);
        System.out.println("Reputasi: "+reputasi);
        System.out.println("Jumlah Menu: "+menu.size());
        System.out.println("Jumlah Karyawan: "+karyawans.size());
    }
}
