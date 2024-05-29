/*
 *  Nama : Rahman Hanif Aji Saputra
 *  File : LambdaList.java
 *  Tanggal : 29/05/2024
 *  Tugas praktikum
 */
import java.util.ArrayList;

public class LambdaList {
    public static void main (String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //dengan Lambda
        mahasiswaList.forEach((nama) -> System.out.println(nama));

        //dengan lambda blok statement
        mahasiswaList.forEach(nama -> {
            System.out.println(nama);
        });

    }
}
