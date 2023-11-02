package dasproproject;

public class MCU {
    
    Pasien[] pasien = new Pasien[100];
    int size = 0;
    
    // input data
    public void inputDataPasien(Pasien data){
        pasien[size] = data;
        size++;
    }
    // cari username
    public int cariUsername(String Username){
        int index = -1;
        for(int i = 0; i < size; i++){
            if(pasien[i].Username.equals(Username)){
                 index = i;
                 break;
            }
        }
        return index;
    }
    // cari indeks id pasien
    public int cariIdPasien(int id){
        int index = -1;
        for(int i = 0; i < size; i++){
            if(pasien[i].idpasien == (id)){
                 index = i;
                 break;
            }
        }
        return index;
    }
    
    // update status pasien
    public void updatePasien(int id, double suhutubuh, double urine, double denyutnadi, double tekanandarah, int Umur, String pendengaran, String penglihatan){
        int index = cariIdPasien(id);
        pasien[index].suhutubuh = suhutubuh;
        pasien[index].urine = urine;
        pasien[index].denyutnadi = denyutnadi;
        pasien[index].tekanandarah = tekanandarah;
        pasien[index].Umur = Umur;
        pasien[index].pendengaran = pendengaran;
        pasien[index].penglihatan = penglihatan;  
    }
    // tampil daftar pasien
    public void tampil() {
        for (int i=0; i< size; i++) {
            pasien[i].tampil();
        }
    }
    
    // tampilkan data tertentu
    public void tampilDataTertentu(int id) {
        int index = cariIdPasien(id);
        pasien[index].tampil();
    }
 
} 

