public class Pemesanan {
    public RisolMayo mayoDipesan;
    public DataPemesanan pembeli;

 void pesan(RisolMayo dataPemesananBaru, DataPemesanan pembeliBaru){
     
    mayoDipesan = dataPemesananBaru;
    pembeli = pembeliBaru;
 }

 void daftarPemesanan()
 {
    System.out.println("nama :     "+pembeli.getNama());
    System.out.println("kelas :   "+pembeli.getKelas());
    System.out.println("Sistem pembelian :   "+pembeli.getSistem());
    System.out.println("Rasa risol yang dipesan :   "+mayoDipesan.getRasaRisol());
 }
}
