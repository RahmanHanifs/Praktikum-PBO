/*
    Nama    : Rahman Hanif Aji Saputra
    NIM     : 24060122140128
    File    : MBujurSangkar.java
*/
import java.util.Scanner;
class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Menghitung Luas Bujur Sangkar : ");
        double sisi=scan.nextDouble();
        System.out.println("Luas Bujur Sangkar = "+bs.hitungLuas(sisi));
        scan.close();
    }
}
