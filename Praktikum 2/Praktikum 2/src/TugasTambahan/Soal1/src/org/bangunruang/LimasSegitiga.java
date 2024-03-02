package org.bangunruang;
import org.bangundatar.SegitigaSamaSisi;
/* Nama : Rahman Hanif Aji Saputra
  Nim	: 24060122140128
  Desc	: LimasSegitiga.java
  file	: LimasSegitiga.java
*/
public class LimasSegitiga {
    private SegitigaSamaSisi alas;
    private double tinggi;

    public LimasSegitiga(SegitigaSamaSisi alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public SegitigaSamaSisi getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double hitungVolume() {
         return (1.0 / 3.0) * alas.hitungLuas() * tinggi;

    }

    public double hitungLuasPermukaan() {
        return alas.hitungLuas() + (3 * ((alas.getPanjangSisi() * tinggi) / 2));
    }
}