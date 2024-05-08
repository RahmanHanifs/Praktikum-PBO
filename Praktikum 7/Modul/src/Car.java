public class Car extends Vehicle {
    void calRent (int jarak, float harga){
        float tarif = jarak * harga;
        tarif = tarif - 100.00f;
        System.out.println("Harga sewa kendaraan; " + tarif);
    }
}
