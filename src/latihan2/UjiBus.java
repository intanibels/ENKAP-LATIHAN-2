package latihan2;
public class UjiBus {
    public static void main(String[] args) {
        //membuat objek busBesar dari class Bus
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(15); //tambah 15
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5); //tambah 5
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26); //tambah 26
        busBesar.cetak();
    }
}