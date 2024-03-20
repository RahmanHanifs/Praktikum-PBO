/*
    Nama    : Rahman Hanif Aji Saputra
    NIM     : 24060122140128
    File    : MLingkaran.java
*/
import java.util.Scanner;
class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung Luas Lingkaran : ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas Lingkaran dengan jejari "+jejari+" adalah : " + l.hitungLuas());
        scan.close();
    }
}