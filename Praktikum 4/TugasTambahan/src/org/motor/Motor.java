/*
    Nama        = Rahman Hanif Aji Saputra
    Nim         = 24060122140128
    Deskripsi   = implementasi class motor
*/
package org.motor;
import org.kendaraan.Kendaraan;
public class Motor extends Kendaraan {
    private int cc ;
    public Motor(String nama,int cc){
        super(nama);
        this.cc=cc;
    }

    public int getCc() {
        return cc;
    }
     public void setCc(){
        this.cc=cc;
     }

    public void cetakinfo() {
        super.cetakinfo();
        System.out.println("Jenis kendaraan = Motor");
        System.out.println("Cc = "+getCc());
    }

    public double hitungHorsepower(int angka ){
        if(angka < 15 || angka > 17){
            System.out.println("angka antara 15 sampai 17");
            return 0;
        }else {
            return cc / angka;
        }
    }
    public void klakson(){
        System.out.println(getNama() + "Womp Womp!");
    }
}
