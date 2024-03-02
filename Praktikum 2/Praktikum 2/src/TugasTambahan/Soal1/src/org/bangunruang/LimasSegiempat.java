package org.bangunruang;
/* Nama : Rahman Hanif Aji Saputra
  Nim	: 24060122140128
  Desc	: LimasSegiempat.java
  file	: LimasSegiempat.java
*/
public class LimasSegiempat {
    private double sisiAlas;
    private double tinggiSegitiga;

    public LimasSegiempat(double sisiAlas, double tinggiSegitiga) {
        this.sisiAlas = sisiAlas;
        this.tinggiSegitiga = tinggiSegitiga;
    }

    public double getSisiAlas() {
        return sisiAlas;
    }

    public void setSisiAlas(double sisiAlas) {
        this.sisiAlas = sisiAlas;
    }

    public double getTinggiSegitiga() {
        return tinggiSegitiga;
    }

    public void setTinggiSegitiga(double tinggiSegitiga) {
        this.tinggiSegitiga = tinggiSegitiga;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = Math.pow(sisiAlas, 2);
        double luasSegitiga = (sisiAlas * tinggiSegitiga) / 2;
        return luasAlas + (4 * luasSegitiga);

    }

    public double hitungVolume() {
        double luasAlas = Math.pow(sisiAlas, 2);
        return (luasAlas * tinggiSegitiga) / 3;

    }
}

