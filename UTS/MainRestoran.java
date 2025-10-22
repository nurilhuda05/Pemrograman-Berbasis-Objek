import java.util.*;

// Kelas utama untuk menjalankan simulasi restoran cepat saji
public class MainRestoran {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner sc = new Scanner(System.in);

        // Membuat objek restoran baru dengan nama dan uang awal
        Restoran resto = new Restoran("FastFoodKu", 0);

        // Menambahkan beberapa makanan ke dalam menu restoran
        resto.tambahMakanan(new Makanan("Burger", 25000, Map.of("Roti",2,"Patty",1,"Keju",1), 2));
        resto.tambahMakanan(new Makanan("Kentang Goreng", 15000, Map.of("Kentang",3,"Minyak",1), 1));
        resto.tambahMakanan(new Makanan("Es Teh", 5000, Map.of("Teh",1,"Es",2,"Gula",1), 0));

        // Menambahkan stok awal bahan-bahan yang digunakan untuk memasak
        resto.getInventory().tambahStok("Roti", 20);
        resto.getInventory().tambahStok("Patty", 20);
        resto.getInventory().tambahStok("Keju", 20);
        resto.getInventory().tambahStok("Kentang", 30);
        resto.getInventory().tambahStok("Minyak", 10);
        resto.getInventory().tambahStok("Teh", 30);
        resto.getInventory().tambahStok("Es", 30);
        resto.getInventory().tambahStok("Gula", 30);

        // Menambahkan dua karyawan awal: satu koki dan satu pelayan
        resto.tambahKaryawan(new Koki("Budi", 5));   // skill 5
        resto.tambahKaryawan(new Pelayan("Siti", 4)); // skill 4

        // Variabel pengontrol agar program tetap berjalan sampai user keluar
        boolean jalan = true;

        // Perulangan utama program
        while (jalan) {
            // Menampilkan menu pilihan untuk pengguna
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tampilkan Menu Makanan");
            System.out.println("2. Lihat Stok Bahan");
            System.out.println("3. Tambah Stok Bahan");
            System.out.println("4. Tambah Karyawan");
            System.out.println("5. Lihat Karyawan");
            System.out.println("6. Pemesanan Manual");
            System.out.println("7. Simulasi Pelanggan Acak");
            System.out.println("8. Laporan Restoran");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            
            // Membaca input pilihan dari pengguna
            String pilih = sc.nextLine();

            // Menjalankan fitur sesuai pilihan user
            switch (pilih) {
                case "1":
                    // Menampilkan daftar menu makanan
                    resto.tampilkanMenu();
                    break;

                case "2":
                    // Menampilkan stok bahan yang tersedia di restoran
                    resto.getInventory().tampilkanStok();
                    break;

                case "3":
                    // Menambah stok bahan baru
                    System.out.print("Nama bahan: ");
                    String bahan = sc.nextLine();
                    System.out.print("Jumlah: ");
                    int jml = Integer.parseInt(sc.nextLine());
                    resto.getInventory().tambahStok(bahan, jml);
                    break;

                case "4":
                    // Menambah karyawan baru ke restoran
                    System.out.print("Tipe (koki/pelayan): ");
                    String tipe = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Skill (1-10): ");
                    int skill = Integer.parseInt(sc.nextLine());

                    // Menentukan tipe karyawan yang ditambahkan
                    if (tipe.equalsIgnoreCase("koki"))
                        resto.tambahKaryawan(new Koki(nama, skill));
                    else
                        resto.tambahKaryawan(new Pelayan(nama, skill));
                    break;

                case "5":
                    // Menampilkan daftar seluruh karyawan
                    resto.lihatKaryawan();
                    break;

                case "6":
                    // Menjalankan fitur pemesanan manual (user memilih sendiri menu)
                    resto.pemesananManual(sc);
                    break;

                case "7":
                    // Menjalankan simulasi pelanggan datang secara acak
                    System.out.print("Masukkan jumlah pelanggan: ");
                    int jmlPelanggan = Integer.parseInt(sc.nextLine());
                    resto.mulaiSimulasi(jmlPelanggan);
                    break;

                case "8":
                    // Menampilkan laporan singkat kondisi restoran
                    resto.laporanSingkat();
                    break;

                case "0":
                    // Keluar dari program
                    jalan = false;
                    break;

                default:
                    // Menangani input yang tidak dikenali
                    System.out.println("Pilihan tidak valid.");
            }
        }

        // Menutup Scanner dan menampilkan pesan akhir
        sc.close();
        System.out.println("Terima kasih! Program selesai.");
    }
}
