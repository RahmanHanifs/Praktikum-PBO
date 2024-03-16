/*
    Nama        = Rahman Hanif Aji Saputra
    Nim         = 24060122140128
    Deskripsi   = implementasi class kendaraan
*/
package org.kendaraan;

public class Kendaraan {
    protected String nama;
    protected int kecepatan;
    public Kendaraan(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public int getKecepatan() {
        return this.kecepatan;
    }
    public void setKecepatan(int kecepatan){
        this.kecepatan=kecepatan;
    }
    public void gas(int kecepatan,int durasi){
        this.kecepatan+=kecepatan;
        System.out.println(nama +" Kecepatan "+ getKecepatan() +" Durasi "+ durasi  );
    }
    public void berhenti() {
        this.kecepatan = 0;
        System.out.println("Kendaraan " + getNama() + " telah berhenti");
    }

    public void klakson() {
        System.out.println(getNama() + " berbunyi" );
    }
    public void cetakinfo(){
        System.out.println("nama = "+getNama());
        System.out.println("kecepatan = "+getKecepatan());
    }

}
