/*
    Nama    : Rahman Hanif Aji Saputra
    NIM     : 24060122140128
    File    : MPoligon.java
*/
package org.Main;
import org.bangundatar.*;
public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang = "+ persegi.hitungLuas());
    }
}
