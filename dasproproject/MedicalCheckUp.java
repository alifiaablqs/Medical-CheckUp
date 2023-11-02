package dasproproject;

import java.util.Scanner;

public class MedicalCheckUp {
    static Scanner myScanner = new Scanner(System.in);
    static MCU mc = new MCU();
    static int id = 0;
    static boolean errorhandling = false;
    static String Nama, JenisKelamin, GolonganDarah, Nohp, Alamat, Riwayatpenyakit, pendengaran, kamar, penglihatan, Username, Password;
    static double suhutubuh, urine, denyutnadi, tekanandarah;
    static int idpasien = 0, Umur;
    
    public static void main(String [] args) {
        while(true){
            System.out.println("==============================================================");
            System.out.println("             Selamat Datang Di Rumah Sakit Ventura            ");
            System.out.println("==============================================================");
            System.out.println("1. Login");
            System.out.println("2. Keluar");
            System.out.print("Masukkan pilihan : ");
            int pilihan = myScanner.nextInt();
            if(pilihan == 1){
                System.out.println("==============================================================");
                System.out.println(" ");
                System.out.print("Masukkan Username : ");
                String user = myScanner.next();
                System.out.print("Masukkan Password : ");
                String pwd = myScanner.next();
                int indeksUsername = mc.cariUsername(user);
                if(user.equals("admin") && pwd.equals("admin")){
                    menuPegawai();
                }else if(indeksUsername != -1){
                    menuPasien(mc.pasien[indeksUsername].idpasien);
                }else {
                    System.out.println("Data Tidak Ditemukan");
                }
                
            }else{
                System.out.println("==============================================================");
                System.out.println("=================== T E R I M A K A S I H ====================");
                System.out.println("==============================================================");
                break;
            }        
        }
          
    }
    static void menuPasien(int id){
        boolean pasienIsTrue= true;
        while (pasienIsTrue) {
            System.out.println("================ Selamat Datang Di Menu Pasien ================");
            System.out.println("|Silahkan Pilih Menu di Bawah Ini                             |");
            System.out.println("|1. Tampil data                                               |");
            System.out.println("|2. Ubah Username                                             |");
            System.out.println("|3. Ubah Password                                             |");
            System.out.println("|4. Keluar                                                    |");
            System.out.println("===============================================================");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = myScanner.nextInt();
            if (pilihan == 1) {
                mc.tampilDataTertentu(id); 
            }else if (pilihan == 2) {
                System.out.print("Masukkan Username Lama : ");
                String UsernameLama = myScanner.next();
            if (UsernameLama.equals(mc.pasien[mc.cariIdPasien(id)].Username)){
                System.out.print("Masukkan Username Baru : ");
                String UsernameBaru = myScanner.next();
                mc.pasien[mc.cariIdPasien(id)].Username = UsernameBaru;
            }else {
                System.out.println("Username Tidak Ditemukan");
            }
            }else if (pilihan == 3) {
                System.out.print("Masukkan Paaswor Lama : ");
                String PasswordLama = myScanner.next();
            if (PasswordLama.equals(mc.pasien[mc.cariIdPasien(id)].Password)){
                System.out.print("Masukkan Password Baru : ");
                String PasswordBaru = myScanner.next();
                mc.pasien[mc.cariIdPasien(id)].Password = PasswordBaru;
            }else {
                System.out.println("Password Tidak Ditemukan");
            }
            }else {
                break;
            }
        }
        
    }
    static void menuPegawai(){  
    int selection;
    
        do {
                errorhandling = true;
                System.out.println("                                                              ");
                System.out.println("================ Selamat Datang Di Menu Admin ================");
                System.out.println("|Silahkan Pilih Menu di Bawah Ini                            |");
                System.out.println("|1.Input Data Pasien                                         |");
                System.out.println("|2.Tampilkan Data Tertentu                                   |");
                System.out.println("|3.Update Status Pasien                                      |");
                System.out.println("|4.Tampilkan Data Pasien                                     |");
                System.out.println("|0.Exit                                                      |");
                System.out.println("==============================================================");
                System.out.print("Masukkan Pilihan : ");
                selection = myScanner.nextInt();
                switch (selection) {
                    case 1:
                        idpasien++;
                        System.out.println("ID Pasien : "+idpasien);
                        System.out.print("Nama Pasien                : ");
                        Nama = myScanner.nextLine();
                        Nama = myScanner.nextLine();
                        System.out.print("Jenis Kelamin Pasien       : ");
                        JenisKelamin = myScanner.nextLine();
                        System.out.print("No Hp Pasien               : ");
                        Nohp = myScanner.next();
                        System.out.print("Alamat Pasien              : ");
                        Alamat = myScanner.nextLine();
                        Alamat = myScanner.nextLine();
                        System.out.print("Gol Darah Pasien           : ");
                        GolonganDarah = myScanner.next();
                        
                        System.out.print("Riwayat Penyakit Pasien    : ");
                        Riwayatpenyakit = myScanner.nextLine();
                        Riwayatpenyakit = myScanner.nextLine();
                        System.out.print("Nomor Kamar Pasien         : ");
                        kamar = myScanner.next();
                        
                        System.out.print("Suhu Tubuh Pasien          : ");
                        suhutubuh = myScanner.nextDouble();
                        System.out.print("Nilai Urine Pasien         : ");
                        urine = myScanner.nextDouble();
                        System.out.print("Nilai Denyut Nadi Pasien   : ");
                        denyutnadi = myScanner.nextDouble();
                        System.out.print("Nilai Tekanan Darah Pasien : ");
                        tekanandarah = myScanner.nextDouble();
                        System.out.print("Pendengaran Pasien         : ");
                        pendengaran = myScanner.nextLine();
                        pendengaran = myScanner.nextLine();
                       
                        System.out.print("Penglihatan Pasien         : ");
                        penglihatan = myScanner.nextLine();
                        System.out.print("Umur Pasien                : ");
                        Umur = myScanner.nextInt();
                        System.out.print("Username Pasien            : ");
                        Username = myScanner.next();
                        System.out.print("Password Pasien            : ");
                        Password = myScanner.next();
                        System.out.println("=============== Data Pasien Berhasil Diinputkan ==============");
                        Pasien data = new Pasien(Nama, Alamat, GolonganDarah, Nohp, JenisKelamin, Riwayatpenyakit, pendengaran, kamar, penglihatan, 
                        idpasien, suhutubuh, urine, denyutnadi, tekanandarah, Umur,Username, Password);
                        mc.inputDataPasien(data);
                        break;
                    case 2:
                        System.out.println("=================== Menu Cari Data Pasien ====================");
                        System.out.print("Masukkan Id Pasien : ");
                        idpasien = myScanner.nextInt();
                        mc.tampilDataTertentu(idpasien);
                        break;
                    case 3:
                        System.out.println("=================== Menu Update Data Pasien ==================");
                        System.out.print("Id Pasien                  : ");
                        idpasien = myScanner.nextInt();
                        System.out.print("Suhu Tubuh Pasien          : ");
                        suhutubuh = myScanner.nextDouble();
                        System.out.print("Nilai Urine Pasien         : ");
                        urine = myScanner.nextDouble();
                        System.out.print("Nilai Denyut Nadi Pasien   : ");
                        denyutnadi = myScanner.nextDouble();
                        System.out.print("Nilai Tekanan Darah Pasien : ");
                        tekanandarah = myScanner.nextDouble();
                        System.out.print("Pendengaran Pasien         : ");
                        pendengaran = myScanner.nextLine();
                        pendengaran = myScanner.nextLine();
                       
                        System.out.print("Penglihatan Pasien         : ");
                        penglihatan = myScanner.nextLine();
                        System.out.print("Umur Pasien                : ");
                        Umur = myScanner.nextInt();
                        mc.updatePasien(idpasien,suhutubuh, urine, denyutnadi, tekanandarah, Umur, pendengaran, penglihatan);
                        break;
                    case 4:
                        mc.tampil();
                        break;
                    case 0:
                        errorhandling = false;
                        break;
                    default:
                        errorhandling = true;
                        System.out.println("====================== Pilihan Salah! =====================\n");
                        break;
                }

        } while (errorhandling);
    }
        
}
    
 
