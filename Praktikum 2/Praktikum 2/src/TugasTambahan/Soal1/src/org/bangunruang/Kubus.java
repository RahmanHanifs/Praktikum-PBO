package org.bangunruang;
import org.bangundatar.BujurSangkar;
/* Nama : Rahman Hanif Aji Saputra
  Nim	: 24060122140128
  Desc	: Kubus.java
  file	: Kubus.java
*/
public class Kubus
{
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan)
    {
        this.permukaan = permukaan;
    }

    public double hitungVolume()
    {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi * panjangSisi;
    }

    public double hitungLuasAlas()
    {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi;
    }
}
