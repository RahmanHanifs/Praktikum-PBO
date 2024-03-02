package org.mahasiswa;
import org.WaliMahasiswa.WaliMahasiswa;
/* Nama : Rahman Hanif Aji Saputra
  Nim	: 24060122140128
  Desc	: Mahasiswa.java
  file	: Mahasiswa.java
*/
public class Mahasiswa {

    private String nama;
    private String nik;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali){
        this.nama = nama;
        this.nik = nik;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public String getNim() {
        return nim;
    }
    public String getJurusan() {
        return jurusan;
    }
    public WaliMahasiswa getWali(){
        return wali;
    }



    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }
    public void cetak(){
        System.out.println("Nama mahasiswa = " + getNama());
        System.out.println("Nik mahasiswa  = " + getNik());
        System.out.println("Nim mahasiswa  = " + getNim());
        System.out.println("Jurusan        = " + getJurusan());
        System.out.println("Wali mahasiswa = " + getWali().getNama());
        System.out.println("Alamat         = " + getWali().getAlamat());
        System.out.println("Nomor Hp       = "+ getWali().getNomorhp());
    }

}


