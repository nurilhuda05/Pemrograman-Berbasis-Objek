public class Rektor {
    public void beriSertifikatCumlaude(Mahasiswa mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");
        
        mahasiswa.kuliahDikampus(); // Semua mahasiswa bisa kuliah di kampus

        if (mahasiswa instanceof ICumlaude) {
            ICumlaude cumlaude = (ICumlaude) mahasiswa;
            cumlaude.lulus();
            cumlaude.meraihIPKTinggi();
        } else {
            System.out.println("Maaf, " + mahasiswa.nama + " belum memenuhi syarat cumlaude.");
        }

        System.out.println("---------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("---------------------------------");
    }
}
