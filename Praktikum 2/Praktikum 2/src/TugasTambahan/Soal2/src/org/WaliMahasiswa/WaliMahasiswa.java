package org.WaliMahasiswa;
/* Nama : Rahman Hanif Aji Saputra
  Nim	: 24060122140128
  Desc	: WaliMahasiswa.java
  file	: WaliMahasiswa.java
*/
public class WaliMahasiswa {
    private String nomorhp;
    private String alamat;

    private String nama;
    private String nik;

    public  WaliMahasiswa(String nama , String nik ,String nomorhp,String alamat){
        this.nama = nama;
        this.nik = nik;
        this.nomorhp = nomorhp;
        this.alamat = alamat;
    }
    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }
    public String getNomorhp() {
        return nomorhp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNomorhp(String nomorhp){
        this.nomorhp = nomorhp;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}

