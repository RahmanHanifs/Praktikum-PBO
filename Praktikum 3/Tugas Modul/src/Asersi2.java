class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari=jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari=10;
        assert(jariJari>0):"jari jari tidak boleh 0 dan tidak boleh negatif";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

//  Tidak ada yang salah pada konsep diatas pembetulan hanya penambahan tidak boleh negatif