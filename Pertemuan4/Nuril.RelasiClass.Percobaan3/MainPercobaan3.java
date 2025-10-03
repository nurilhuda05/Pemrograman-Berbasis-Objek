public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob");
        Pegawai asisten = new Pegawai("4567","Partick");
        KeretaApi keretaApi = new KeretaApi ("Gaya Baru", "Bisnis", masinis, asisten);

        System.out.println(keretaApi.info());
    }
}
