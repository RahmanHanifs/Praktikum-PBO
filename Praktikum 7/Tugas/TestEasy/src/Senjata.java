/*
Nama    : Rahman Hanif Aji Saputra
NIM     : 24060122140128
Tanggal : 9/5/2024
*/
public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi(){
        return bunyi;
    }

    public int getPeluru(){
        return peluru;
    }
    
    public void menembak(){
        System.out.println(getBunyi());
        System.out.println("Sisa Peluru: " + (getPeluru() - 1));
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
