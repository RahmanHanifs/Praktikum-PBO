// Nama         : Rahman Hanif Aji Saputra
// NIM          : 24060122140128
// Deskripsi    : Kelas yang berisi program Anggota,buatan sendiri rill
// Tanggal      : 8 Maret 2024

public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException,BukuTidakTersediaException {
        if (jumlahBukuPinjaman >= 3) {
            throw new MaksimumBukuTerpinjamException("Anggota telah meminjam maksimum 3 buku.");
        }
        else if (!buku.isTersedia()) {
            throw new BukuTidakTersediaException("Buku tidak tersedia untuk dipinjam.");
        }else {
            buku.setTersedia(false);
            bukuPinjaman[jumlahBukuPinjaman] = buku;
            jumlahBukuPinjaman++;
        }
    }

}
