import javax.swing.*;
import java.util.Scanner;

public class kalkulator {

    public static void main(String[] args){

        int  angka1,angka2, hasil=0;
        boolean list = true;
        Scanner kalkulator = new Scanner(System.in);
        while (list) {


            System.out.println("Silahkan pilih opsi :");
            System.out.println("1.Penjumlahan");
            System.out.println("2.Pengurangan");
            System.out.println("3.Pembagian");
            System.out.println("4.Perkalian");
            System.out.println("5.keluar");

            System.out.println("Pilihan opsi");
            int opsi = kalkulator.nextInt();

            switch (opsi){

                case 1:
                    System.out.println("==========PENJUMLAHAN=========");
                    System.out.println("masukkan angka pertama :");
                    angka1 = kalkulator.nextInt();
                    System.out.println("Masukkan angka kedua :");
                    angka2 = kalkulator.nextInt();
                    hasil=  angka1 + angka2;
                    System.out.println("hasilnya adalah =" + hasil);

                    break;

                case 2:
                    System.out.println("==========PENGURANGAN=========");
                    System.out.println("Masukkan angka pertama :");
                    angka1 = kalkulator.nextInt();
                    System.out.println("Masukkan angka kedua :");
                    angka2 = kalkulator.nextInt();
                    hasil = angka1 - angka2;
                    System.out.println("hasilnya adalah =" + hasil);

                    break;

                case 3:
                    System.out.println("==========PEMBAGIAN=========");
                    System.out.println("Masukkan angka pertama :");
                    angka1 = kalkulator.nextInt();
                    System.out.println("Masukkan angka kedua :");
                    angka2 = kalkulator.nextInt();
                    hasil = angka1 / angka2;
                    System.out.println("hasilnya adalah =" + hasil);

                    break;

                case 4:
                    System.out.println("==========PERKALIAN=========");
                    System.out.println("Masukkan angka pertama :");
                    angka1 = kalkulator.nextInt();
                    System.out.println("Masukkan angka kedua :");
                    angka2 = kalkulator.nextInt();
                    hasil = angka1 * angka2;
                    System.out.println("hasilnya adalah =" + hasil);

                    break;

                case 5:
                    if (opsi == 5 );
                    list = false;
                    System.out.println("ANDA TELAH KELUAR");

                    break;

                default:
                    System.out.println("Silahkan pilih opsi yang benar" );



            }




        }

    }


    }


