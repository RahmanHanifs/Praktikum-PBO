/**
 * File     	 : Main.java
 * Nama penulis  : Rahman Hanif Aji Saputra
 * NIM           : 24060122140128
 */
public class Main {
    public static void main(String[] args) {
        // Kamus
        Ulat K;
        Data<Kupu> coba;
        // Algoritma
        K = new Ulat();
        coba = new Data<Kupu>();
        coba.setIsi(K);
        coba.getIsi().gerak();
        coba.setIsi(new Kepompong());
        coba.getIsi().gerak();
        coba.setIsi(new KupuDewasa());
        coba.getIsi().gerak();
    }
}