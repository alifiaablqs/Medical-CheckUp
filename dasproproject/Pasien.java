package dasproproject;

public class Pasien {
    String Nama, Alamat, GolonganDarah, Nohp, JenisKelamin, Riwayatpenyakit, pendengaran, kamar, penglihatan;
    double suhutubuh, urine, denyutnadi, tekanandarah;
    int Umur, idpasien;
    String Username, Password;
    
    String inputDataPaien;
    public Pasien(String Nama, String Alamat, String GolonganDarah, String Nohp, String JenisKelamin, String Riwayatpenyakit, 
        String pendengaran, String kamar, String penglihatan, int idpasien, double suhutubuh, double urine, double denyutnadi, double tekanandarah, int Umur, String username, String Password) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.GolonganDarah = GolonganDarah;
        this.Nohp = Nohp;
        this.JenisKelamin = JenisKelamin;
        this.Riwayatpenyakit = Riwayatpenyakit;
        this.pendengaran = pendengaran;
        this.kamar = kamar;
        this.penglihatan = penglihatan;
        this.idpasien = idpasien;
        this.suhutubuh = suhutubuh;
        this.urine = urine;
        this.denyutnadi = denyutnadi;
        this.tekanandarah = tekanandarah;
        this.Umur = Umur;
        this.Username = username;
        this.Password = Password;
    }
    
    void tampil() {
    System.out.println("==============================================================");
    System.out.println("|   ID PASIEN    |          NAMA PASIEN           |     JENIS KELAMIN     |  GOLONGAN DARAH  |     NO. HP      |     ALAMAT     |          RIWAYAT PENYAKIT         |   KAMAR   |   SUHU TUBUH    |   URINE   |   DENYUT NADI   |   TEKANAN DARAH   |   PENDENGARAN   |   PENGLIHATAN   |  UMUR   |   USERNAME    |    PASSWORD   |");
    System.out.println("|\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\tt\t\t|\t\t\t\t\t\t\t\t\t|t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t|t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|t\t\t\t\t\t|t\t\t\t\t\t\t\t\t|t\t\t\t\t\t|t\t\t\t\t\t\t\t\t|t\t\t\t\t\t\t\t\t\t|t\t\t\t\t\t\t\t\t|t\t\t\t\t\t\t\t\t|t\t\t\t\t|t\t\t\t\t\t\t\t|t\t\t\t\t\t\t\t|");
    System.out.printf("|   %-15s   | ", idpasien);
    System.out.printf("|   %-10s   | ", Nama);
    System.out.printf("|   %-10s   | ", JenisKelamin);
    System.out.printf("|   %-10s   | ", GolonganDarah);
    System.out.printf("|   %-10s   | ", Nohp);
    System.out.printf("|   %-10s   | ", Alamat);
    System.out.printf("|   %-40s   | ", Riwayatpenyakit);
    System.out.printf("|   %-45s   | ", kamar);
    System.out.printf("|   %-50s   | ", suhutubuh + " Derajat Celcius");
    System.out.printf("|   %-55s   | ", urine);
    System.out.printf("|   %-60s   | ", denyutnadi + " Bpm");
    System.out.printf("|   %-65s   | ", tekanandarah + " mmHg");
    System.out.printf("|   %-70s   | ", pendengaran);
    System.out.printf("|   %-75s   | ", penglihatan);
    System.out.printf("|   %-80s   | ", Umur + " Tahun");
    System.out.println("==============================================================");
}

    
}
