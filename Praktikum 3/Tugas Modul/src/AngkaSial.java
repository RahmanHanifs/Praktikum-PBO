public class AngkaSial {
    public void cobaAngka (int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " Bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch (AngkaSialException asi){
            System.out.println(asi.getMessage());
            System.out.println("Hati Hati memasukan angka");
        }
    }
}
//soal1
//saat as cobaangka(10) line 12 akan dieksekusi karena tidak masuk pada kondisional if , saat as.coba angka(13)
//maka line 12 tidak akan di eksekusi karena setelah memasuki kondisi if dan di throw maka line 12 akan di skip atau
//tidak akan di eksekusi, pada saat as.cobaangka(12) akan di skip karena saat ascobaangka(13) akan lagsung masuk ke catch
//maka as.cobaangka(12) tidak akan dieksekusi

//soal2
//pada saat angka 10 maka akan tidak akan dieksekusi karena tidak memasuki kondisi exceptional maka tidak akan di catch oleh AngkaSialException
//pada saat angka 13 maka akan dieksekusi karena memasuki kondisi exceptional maka akan langsung di catch oleh AngkaSialException
//dan akan mengeksekusi getmessage dan mengeksekusi System.out.println("Hati Hati memasukan angka");