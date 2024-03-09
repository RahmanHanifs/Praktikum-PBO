// Nama         : Rahman Hanif Aji Saputra
// NIM          : 24060122140128
// Deskripsi    : Kelas yang berisi program Buku, buatan sendiri rill
// Tanggal      : 8 Maret 2024
public class Buku {
    private String judul;
    private boolean tersedia;

    public Buku(String judul) {
        this.judul = judul;
        tersedia = true;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

}
