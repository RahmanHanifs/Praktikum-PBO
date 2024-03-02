package org.main;
import org.bangundatar.*;
import org.bangunruang.*;
/* Nama : Rahman Hanif Aji Saputra
  Nim	: 24060122140128
  Desc	: MKubus.java
  file	: MKubus.java
*/
public class MKubus
{
    public static void main(String[] args)
    {
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas permukaan kubus dengan panjang sisi 4 satuan: " + kubus.hitungLuasAlas());
        System.out.println("Volume kubus dengan panjang sisi 4 satuan: " + kubus.hitungVolume());
    }
}
