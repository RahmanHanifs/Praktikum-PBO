/*
    Nama        = Rahman Hanif Aji Saputra
    Nim         = 24060122140128
    Deskripsi   = implementasi main dari class Kendaraan,motor,mobil,truk
*/
package org.main;
import org.truk.Truk;
import org.mobil.Mobil;
import org.kendaraan.Kendaraan;
import org.motor.Motor;

public class MKendaraan {
    public static void main(String[] args)
    {
        Kendaraan kendaraan = new Kendaraan("Kendaraan Nathan");
        Mobil mobil = new Mobil("Bugatti Chiron", 2);
        Motor motor  = new Motor("Ducati Panigale V4 R", 1000);
        Truk truk = new Truk("Mercedes-Benz Actros", 20);

        kendaraan.klakson(); // output: Kendaraan Nathan berbunyi
        mobil.klakson(); // output: Bugatti Chiron berbunyi, Vroom Vroom!
        motor.klakson(); // output: Ducati Panigale V4 R berbunyi, Womp Womp!
        truk.klakson(); // output: Mercedes-Benz Actros berbunyi, Honk Honk!
        System.out.println("\n");

        //Kendaraan
        kendaraan.gas(50,6);
        kendaraan.cetakinfo();
        kendaraan.berhenti();

        System.out.println("\n");
        //Mobil
        mobil.gas(100,1);
        mobil.cetakinfo();
        mobil.bukaPintu(2);

        System.out.println("\n");

        //motor
        motor.gas(120,3);
        motor.cetakinfo();
        //Asumsi karena dalam diagram output hitungsorsepower adalah double maka string terdapat pada main
        System.out.println("Motor "+motor.getNama() +" diperkirakan memiliki tenaga antara "+motor.hitungHorsepower(17)+" sampai "+motor.hitungHorsepower(15) );

        System.out.println("\n");
        //truk
        truk.gas(60,2);
        truk.cetakinfo();
        truk.muatBarang(10);
    }
}
