// Nama         : Rahman Hanif Aji Saputra
// NIM          : 24060122140128
// Deskripsi    : Kelas yang berisi program utama
// Tanggal      : 8 Maret 2024
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.addItem("Buku");
        keranjang.addItem("Pensil");
        keranjang.addItem("Penghapus");
        keranjang.addItem("Penggaris");
        keranjang.addItem("Meja Lipat");
//        keranjang.addItem("Cermin");
        keranjang.printItems();
    }
}
