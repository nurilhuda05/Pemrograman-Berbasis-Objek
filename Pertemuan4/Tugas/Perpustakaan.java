package Tugas;

public class Perpustakaan {
    private String nama;
    private RakBuku[] daftarRak;

    public Perpustakaan(String nama, int jumlahRak) {
        this.nama = nama;
        this.daftarRak = new RakBuku[jumlahRak];
    }

    public void tambahRak(RakBuku rak, int posisi) {
        daftarRak[posisi] = rak;
    }

    public String info() {
        String info = "Perpustakaan: " + nama + "\n\n";
        for (RakBuku rak : daftarRak) {
            if (rak != null) {
                info += rak.info() + "\n";
            }
        }
        return info;
    }
}

