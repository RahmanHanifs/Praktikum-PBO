public class Polimorfisme10a {
    // Overloaded methods
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
         Polimorfisme10a poli = new Polimorfisme10a();
         int result1 = poli.add(1, 2);               // Memanggil add(int, int)
         double result2 = poli.add(2.5, 3.5);         // Memanggil add(double, double)
         int result3 = poli.add(1, 2, 3);            // Memanggil add(int, int, int)


    }
}
