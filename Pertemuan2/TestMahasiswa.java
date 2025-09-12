public class TestMahasiswa {
    public static void main(String[] args) {
        // Objek pertama
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        System.out.println("-------------------------");

        // Objek kedua
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Andi";
        mhs2.alamat = "Jl. Melati No 10";
        mhs2.kelas = "1B";
        mhs2.tampilBiodata();

        System.out.println("-------------------------");

        // Objek ketiga
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Budi";
        mhs3.alamat = "Jl. Kenanga No 5";
        mhs3.kelas = "1C";
        mhs3.tampilBiodata();
    }
}
