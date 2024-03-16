/*
    Nama        = Rahman Hanif Aji Saputra
    Nim         = 24060122140128
    Deskripsi   = implementasi class mobil
*/
package org.mobil;
import org.kendaraan.Kendaraan;
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    public Mobil(String nama,int jumlahPintu) {
        super(nama);
        this.jumlahPintu=jumlahPintu;
    }
    public int getJumlahPintu(){
        return jumlahPintu;
    }
    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu=jumlahPintu;
    }
    public void cetakinfo(){
        super.cetakinfo();
        System.out.println("Jenis kendaraan = Mobil");
        System.out.println("jumlahPintu = "+getJumlahPintu());
    }
    public void bukaPintu(int nomorPintu){
        if(nomorPintu<=jumlahPintu) {
            System.out.println("Pintu mobil ke " + nomorPintu + " telah terbuka");
        }else{
            System.out.println("hanya terdapat "+ jumlahPintu + " pintu" );
        }
    }
    public void klakson(){
        System.out.println(getNama()+ "Vroom Vroom!");
    }
}
