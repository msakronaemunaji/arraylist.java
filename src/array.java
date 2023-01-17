public class array {
    public static void main(String[] arg) {

        //deklarasi array e.g

        int[]angka = new int[3];// 3 cell - indeknya dari 0 sampai 2
        String[] nama = new String [4];

        //memasukkan value kedalam array angka
        angka [0]=2;
        angka [0]=4;

        //mengambil value dari array angka;
        int s = angka[2];

        //memasukkan value kedalam array String nama
        nama[2] = "sakron";
        nama[3] = "fiqi";

        //mengambil value dari array String nama
        String u = nama [2];
        String t = nama [3];

        //deklarasi array dengan cara lain
        int[] number = {1,45,7,34,89,12}; // ada 6 cell - integer
        for(int index =0;index<number.length;index++){
            System.out.println("Anngka dalam array Number = " + number[index]);

        }


    }







}
