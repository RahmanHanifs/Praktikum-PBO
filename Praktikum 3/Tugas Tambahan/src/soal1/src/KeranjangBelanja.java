// Nama         : Rahman Hanif Aji Saputra
// NIM          : 24060122140128
// Deskripsi    : Kelas yang berisi program KeranjangBelanja
// Tanggal      : 8 Maret 2024
public class KeranjangBelanja {
    private String[] keranjang;
    private int count;
    public KeranjangBelanja() {
        keranjang = new String[5];
        count = 0;
    }

    public void addItem(String item) {
        assert (count < keranjang.length):"Keranjang Sudah Penuh";
        keranjang[count]=item;
        count+=1;
    }
    public void printItems() {
        for (int i = 0; i < keranjang.length; i++) {
            System.out.println(keranjang[i]);
        }
    }
}
