/*
    Nama    : Rahman Hanif Aji Saputra
    NIM     : 24060122140128
    File    : Segitiga.java
*/
package org.bangundatar;
import org.Poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return alas*tinggi/2;
    }

    public void printinfo() {
        System.out.println("Bangun Segitiga = " +this.getjumlahSisi());
    }

}