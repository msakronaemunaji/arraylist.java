import java.util.Scanner;

public class belajar {

    public static void main(String[] args) {

        Scanner Listmenu = new Scanner(System.in);

        int pilihan;
        String nasilengko = ("1. NASI LENGKO ");
        String nasikuning = ("2. NASI KUNING ");
        String nasihijau;
        String nasihitam;
        String nasiputih;



        boolean ulang = true;

        System.out.println("Selamat Datang di warung BABEH:) ");
        System.out.println("Silahkan mau ngutang menu apa ");
        System.out.println("===============================");

        while (ulang) {
            System.out.println("1. NASI LENGKO ");
            System.out.println("2. NASI KUNING ");
            System.out.println("3. NASI HIJAU ");
            System.out.println("4. NASI HITAM");
            System.out.println("5. NASI PUTIH ");
            int opsipesanan = Listmenu.nextInt();

            switch (opsipesanan) {

                case 1 :

                    System.out.println("TERIMAKASIH SILAHKAN DITUNGGU " + nasilengko );


            }


        }

    }
    }
