import java.util.Scanner;

public class arrayFOR {
    public static void main (String[] args){
        String[] keranjang_kuning = new String[5];
        keranjang_kuning[0]="Sutra";
        keranjang_kuning[1]="shampoo";
        keranjang_kuning[2]="sabun mandi";
        keranjang_kuning[3]="parfum";
        keranjang_kuning[4]="teh botol";

        String[] keranjang_kuning2 = new String[5];
        Scanner inputdata = new Scanner(System.in);
        for (int idx=0;idx<keranjang_kuning2.length;idx++){
            System.out.println("Masukkan Nama Barang = ");
            keranjang_kuning[idx] = inputdata.nextLine();

            System.out.println("Belanjaan anda adalah ");
            for(int i=0;i<keranjang_kuning.length;i++){
                System.out.println(keranjang_kuning2[i]);
            }



        }


    }

}
