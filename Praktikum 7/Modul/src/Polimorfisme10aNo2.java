public class Polimorfisme10aNo2 {
    public static void main(String[] args) {
        //10aNo2

        int output = 'a';
        System.out.println(output);
        // berhasil, mengeluarkan nilai ascii dari a

        double x = 15.5;
        //int outputs = x;
        //System.out.println(outputs);
        // hasil error

        int y = 25;
        double y1 = y;
        System.out.println(y1);
        //berhasil, megeluarkan nilai double 25.0

        int z = 78;
        char z1 = (char)z;
        System.out.println(z1);
        //berhasil , mengeluarkan char N dimana dalam asci bernilai 78

        char a = 'a';
        double a1 = a;
        System.out.println(a1);
        //berhasil , mengeluarkan angka 97.0 dimana mengeluarkan angka asci yg bernilai double


    }
}
