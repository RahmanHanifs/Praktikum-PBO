public class Garis {
    private Titik titikAwal,titikAkhir;

    public Garis (Titik titikAwal,Titik titikAkhir){
        this.titikAwal=titikAwal;
        this.titikAkhir=titikAkhir;
    }

    public void setTitikAwal(Titik t){
        titikAwal = t;
    }
    public void setTitikAkhir(Titik t){
        titikAkhir = t;
    }
    public Titik getTitikAwal( ){
        return titikAwal;
    }
    public Titik getTitikAkhir( ){
        return titikAkhir;
    }
    public double getPanjang(){
        return Math.sqrt((Math.pow(titikAwal.getOrdinat(),2)-Math.pow(titikAwal.getAbsis(),2))+(Math.pow(titikAkhir.getOrdinat(),2)-Math.pow(titikAkhir.getAbsis(),2))) ;
    }
    public double getGradien(){
        return (titikAkhir.getOrdinat())-(titikAwal.getOrdinat())/(titikAkhir.getAbsis()- titikAwal.getAbsis());
    }

}
