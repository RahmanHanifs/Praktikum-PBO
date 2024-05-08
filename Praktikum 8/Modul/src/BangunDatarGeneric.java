public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 bangunDatar;

    public void set ( T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    public T1 get(){
        return bangunDatar;
    }
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }

        
    //bagian T1 hanyalah penamaan saja meskipun semua T1 tersebut diganti T atau T2 dll 
    //maka outputnya akan sama karena itu hanya penamaan saja 
}
