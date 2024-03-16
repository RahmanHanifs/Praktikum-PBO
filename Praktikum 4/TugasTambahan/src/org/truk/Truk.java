/*
    Nama        = Rahman Hanif Aji Saputra
    Nim         = 24060122140128
    Deskripsi   = implementasi class truk
*/
package org.truk;
import org.kendaraan.Kendaraan;

public class Truk extends Kendaraan {
    private int kapasitasMuatan;
    private int beratMuatan;
    public Truk(String nama,int kapasitasMuatan){
        super(nama);
        this.kapasitasMuatan=kapasitasMuatan;
    }

    public int getBeratMuatan() {
        return beratMuatan;
    }
    public void setBeratMuatan(int beratMuatan){
        this.beratMuatan=beratMuatan;
    }

    public int getKapasitasMuatan() {
        return kapasitasMuatan;
    }
    public void setKapasitasMuatan(){
        this.kapasitasMuatan=kapasitasMuatan;
    }

    public void cetakinfo(){
        super.cetakinfo();
        System.out.println("Jenis kendaraan = Truk");
        System.out.println("kapasitasMuatan "+getKapasitasMuatan());
        System.out.println("beratMuatan "+getBeratMuatan());
    }
    public void muatBarang(int berat){
        if(kapasitasMuatan<=beratMuatan) {
            this.beratMuatan += berat;
        }else {
            System.out.println("Berat sudah melebihi Kapasitas Muatan");
        }
    }
    public void klakson(){
        System.out.println(getNama()+ "Honk Honk!");
    }
}
