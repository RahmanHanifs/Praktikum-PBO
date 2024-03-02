package org.bangundatar;
import org.poligon.Poligon;
/* Nama : Rahman Hanif Aji Saputra
  Nim	: 24060122140128
  Desc	: SegitigaSamaSisi.java
  file	: SegitigaSamaSisi.java
*/
public class SegitigaSamaSisi extends Poligon {
    private double panjangSisi;

    public SegitigaSamaSisi(double panjangSisi) {
        this.panjangSisi = panjangSisi;
    }
    public double hitungLuas() {
        return (Math.sqrt(3) / 4) * panjangSisi * panjangSisi;
    }
    public double getPanjangSisi() {
        return panjangSisi;
    }
    public double hitungKeliling() {
        return 3 * panjangSisi;
    }
}
