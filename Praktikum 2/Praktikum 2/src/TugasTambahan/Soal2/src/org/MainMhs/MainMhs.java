/* Nama : Rahman Hanif Aji Saputra
  Nim	: 24060122140128
  Desc	: MainMhs.java
  file	: MainMhs.java
*/
package org.MainMhs;
import org.Orang.Orang;
import org.WaliMahasiswa.WaliMahasiswa;
import org.mahasiswa.Mahasiswa;

public class MainMhs {
    public static void main(String[] args) {
        WaliMahasiswa W1;
        Mahasiswa M1;
        W1 = new WaliMahasiswa("Bapak","123214142","08123124","japan");
        M1 = new Mahasiswa("Raka","12210235253","2012914","Informatika",W1);
        M1.cetak();
    }
}
