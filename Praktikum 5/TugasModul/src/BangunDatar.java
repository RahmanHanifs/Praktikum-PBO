/*
    Nama    : Rahman Hanif Aji Saputra
    NIM     : 24060122140128
    File    : BangunDatar.java
*/
public abstract class BangunDatar {
    protected double luas;
    public abstract double hitungLuas(double sisi);
    public void setLuas(double luas) {
        this.luas = luas;
    }
    public double getLuas() {
        return luas;
    }
}