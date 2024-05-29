/*
 *  Nama : Rahman Hanif Aji Saputra
 *  File : LambdaLatihan.java
 *  Tanggal : 29/05/2024
 *  Tugas praktikum
 */
import java.util.HashMap;
import java.util.Map;

public class LambdaLatihan {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("2406011", "Adi");
        mahasiswaMap.put("2406012", "Bambang");
        mahasiswaMap.put("2406013", "Cici");
        mahasiswaMap.put("2406014", "Didi");

        //dengan lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println( nim + ", " + nama));

        //dengan lambda blok statement
        mahasiswaMap.forEach((nim, nama )-> {
            System.out.println( nim + ", " + nama);
        });
    }
}
