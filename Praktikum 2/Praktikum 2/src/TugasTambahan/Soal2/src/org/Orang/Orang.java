package org.Orang;
/* Nama : Rahman Hanif Aji Saputra
  Nim	: 24060122140128
  Desc	: Orang.java
  file	: Orang.java
*/
public class Orang {
    protected String  nama;
    protected String  nik;
    public Orang (String nama,String nik){
        this.nama = nama;
        this.nik  = nik;
    }
    public String getNama(){
        return this.nama;
    }
    public String getNik(){
        return this.nik;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
}
