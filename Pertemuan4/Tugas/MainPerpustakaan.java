package Tugas;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan("Perpus Polinema", 3);

        RakBuku rak1 = new RakBuku("A", 2);
        RakBuku rak2 = new RakBuku("B", 3);
        RakBuku rak3 = new RakBuku("C", 4);

        perpus.tambahRak(rak1, 0);
        perpus.tambahRak(rak2, 1);
        perpus.tambahRak(rak3, 02);

        Buku b1 = new BukuPelajaran("PBO", "Andi", "Informatika");
        Buku b2 = new Majalah("Metode Numerik", "Budi", "Edisi Maret 2025");
        Buku b3 = new Buku("Struktur Data", "Citra");

        rak1.tambahBuku(b1, 0);
        rak2.tambahBuku(b2, 1);
        rak3.tambahBuku(b3, 0);

        Anggota agt1 = new Anggota("Huda", "1234");
        agt1.pinjamBuku(b2); 

        Anggota agt2 = new Anggota("Nuril", "4567");
        agt2.pinjamBuku(b1);

        Anggota agt3 = new Anggota("Ahmad", "9876");
        agt3.pinjamBuku(b3);
        
        System.out.println(perpus.info());
    }
}
