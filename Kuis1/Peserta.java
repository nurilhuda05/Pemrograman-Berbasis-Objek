// Peserta.java
// Menyimpan data peserta kursus

public class Peserta {
    private String nama;
    private String email;

    public Peserta(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public void tampilkanInfo() {
        System.out.println("Peserta: " + nama + " (" + email + ")");
    }

    @Override
    public String toString() {
        return nama + " (" + email + ")";
    }
}
