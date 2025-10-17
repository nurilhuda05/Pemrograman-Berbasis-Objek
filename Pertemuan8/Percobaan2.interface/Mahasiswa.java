public class Mahasiswa {
    protected String nama;
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    public void kuliahDikampus(){
        System.out.println("Aku mahasiswa, namaku "+ this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

}
