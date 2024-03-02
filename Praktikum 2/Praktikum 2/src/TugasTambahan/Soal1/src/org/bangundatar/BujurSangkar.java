package org.bangundatar;
import org.poligon.Poligon;
/* Nama : Rahman Hanif Aji Saputra
  Nim	: 24060122140128
  Desc	: BujurSangkar.java
  file	: BujurSangkar.java
*/
public class BujurSangkar extends Poligon 
{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi)
    {
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas()
    {
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi() 
    {
        return this.panjangSisi;
    }
}
