package latihan2;
public class Bus {
    //membuat variabel instance
    private int penumpang;
    private int maxPenumpang;
    
    //konstruktor kelas Bus
    public Bus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    //method mutator untuk menambahkan penumpang
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang; //menambah jumlah penumpang
        if(temp>=maxPenumpang){ //jika jumlah penumpang melebihi maksimal penumpang
            System.out.println("Penumpang melebihi kuota"); //akan muncul penumpang melebihi kuota
        }else{ // jika tidak
            this.penumpang = temp; //jumlah penumpang sama dengan temp
        }
    }
    //method menampilkan hasil output
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah "+penumpang); //menampilkan output jumlah penumpang
        System.out.println("Penumpang maksimum seharusnya adalah "+maxPenumpang); //menampilkan output maksimal penumpang
    }
}
//sebelumnya belum terdapat program di method main sehingga tidak muncul hasil output
//setelah diprogram di method main, output akan muncul