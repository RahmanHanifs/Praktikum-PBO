package org.main;
import org.bangunruang.LimasSegiempat;
/* Nama : Rahman Hanif Aji Saputra
  Nim	: 24060122140128
  Desc	: MLimasSegiempat.java
  file	: MLimasSegiempat.java
*/
public class MLimasSegiempat {

        public static void main(String[] args) {
            LimasSegiempat limas = new LimasSegiempat(4, 7);

            System.out.println("Luas Permukaan Limas = " + limas.hitungLuasPermukaan());
            System.out.println("Volume Limas         = " + limas.hitungVolume());
        }


}
