import java.util.ArrayList;

public class arraylist {
    public static void main (String []args){
        //deklarasi arraylist
        ArrayList<String> Judul = new ArrayList<>();

        //memasukan value kedalam arraylist
        Judul.add(0,"Harry Potter");
        Judul.add(1,"Wakanda");
        Judul.add(2,"Black Adam");

        //mengetahui total kapasitas suatu arraylist
        System.out.println(Judul.size());

        //perusahaan mobil Toyota
        mobil Veloz = new mobil (4,1500,"biru",7);

        //perusahaan mobil honda
        mobil Civic = new mobil(5,1510,"ungu",9);

        //perusahaan suzuki mau bikin mobil sebanyak 100
        mobil[] ertigaHybrid= new mobil [100];
        for(int index  = 0 ;index< ertigaHybrid.length;index++){
            mobil s = new mobil (7,1700," kuning",10);
            ertigaHybrid[index]=s ;
        }

        //untuk mengambil value dari ArrayList ertigaHybrid
        for(int index = 0; index <ertigaHybrid.length;index++){

            System.out.println("Mobil Ertiga Hybrid ke - "+index);
            System.out.println("Roda : " + ertigaHybrid[index].JumlahRoda+"Mesin: "+ ertigaHybrid[index].KapasitasMesin+" Warna:" + ertigaHybrid[index].Warna+" kursi: "+ertigaHybrid[index].JumlahJok+"\n");
        }
    }

}
