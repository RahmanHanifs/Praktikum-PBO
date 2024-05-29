/*
 *  Nama : Rahman Hanif Aji Saputra
 *  File : DiskonLambda.java
 *  Tanggal : 29/05/2024
 *  Tugas praktikum
 */
interface iDiskon{
    public double hitungDiskon(int harga);
}
public class DiskonLambda {
    public static void main(String[] args) {
        iDiskon diskonMerdeka = new iDiskon(){
            public double hitungDiskon(int harga){
                return harga -(harga*0.3);
            }
        };

        iDiskon diskonLebaran = (harga) -> harga - (harga*0.4);
        iDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: "+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: "+diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: "+diskonBiasa.hitungDiskon(45000));



    }
}