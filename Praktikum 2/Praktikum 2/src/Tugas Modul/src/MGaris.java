// Nama : Rahman Hanif Aji Saputra
// Nim	: 24060122140128
// Desc	: MGaris.java
// file	: MGaris.java
public class MGaris {
    public static void main(String[] args){
        Titik t1,t2,t3,t4,t5,t6;
        Garis g1,g2,g3,g4;

        t1 = new Titik(1,6);
        t2 = new Titik(2,3);
        t3 = new Titik(3,4);
        t4 = new Titik(4,3);
        t5 = new Titik(4,4);
        t6 = new Titik(5,5);


        g1 = new Garis(t1,t2);
        g2 = new Garis(t3,t4);
        g3 = new Garis(t5,t6);
        g4 = g3.getrefleksiY();


        System.out.println("g1(" + g1.getTitikAwal().getAbsis() + "," + g1.getTitikAwal().getOrdinat() + ")"+","+"("+g1.getTitikAkhir().getAbsis() + "," + g1.getTitikAkhir().getOrdinat()+")");
        System.out.println("g2(" + g2.getTitikAwal().getAbsis() + "," + g2.getTitikAwal().getOrdinat() + ")"+","+"("+ g2.getTitikAkhir().getAbsis() + "," + g2.getTitikAkhir().getOrdinat() + ")");
        System.out.println("g3(" + g3.getTitikAwal().getAbsis() + "," + g3.getTitikAwal().getOrdinat() + ")"+","+"("+ g3.getTitikAkhir().getAbsis() + "," + g3.getTitikAkhir().getOrdinat() + ")");
        System.out.println("Panjang garis G1 = " + g1.getPanjang());
        System.out.println("Gradien G2 = " + g2.getGradien());
        System.out.println("Gradien G3 = " + g3.getGradien());
        System.out.println( "is G2 dan G3 TegakLurus = "+ g2.IstegakLurus(g3));
        System.out.println("g4 hasil dari get refleksi g3 = (" + g4.getTitikAwal().getAbsis() + "," + g4.getTitikAwal().getOrdinat()+")"+","+"("+ g4.getTitikAkhir().getAbsis() + "," + g4.getTitikAkhir().getOrdinat() + ")");

    }
}
