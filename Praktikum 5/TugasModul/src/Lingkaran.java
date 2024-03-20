/*
    Nama    : Rahman Hanif Aji Saputra
    NIM     : 24060122140128
    File    : Lingkaran.java
*/
import static java.lang.Math.PI;
public class Lingkaran {
    private double jejari;
    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}