public class pesananRisol {
    public static void main(String[] args) {
        RisolMayo mayoDipesan = new RisolMayo();
        DataPemesanan pembeli = new DataPemesanan();

        pembeli.setName("Mukti Ndaru Andini");
        pembeli.setKelas("11 RPL 1 ");
        pembeli.setSistem("ketemuan");

        mayoDipesan.setRasaRisol("biasa(isi telur dan mayo)");
        
        Pemesanan dipesan =  new Pemesanan();
        dipesan.pesan(mayoDipesan, pembeli);
        dipesan.daftarPemesanan();
    }
}
