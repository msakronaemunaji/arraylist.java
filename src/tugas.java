import java.util.Scanner;

public class tugas {
    public static void main(String[] args){

        String studentname;
        double massa;
        double kecepatan;
        double Fnewton;
        double perpindahanBenda;
        double waktu;
        double energikinetik;
        double kecepatanAkhir;

        Scanner EK =
                new Scanner(System.in);
        System.out.println("Input Fullname :");
        studentname = EK.nextLine();
        System.out.println("Input massa :");
        massa = EK.nextDouble();
        System.out.println("Input kecepatan :");
        kecepatan = EK.nextDouble();
        System.out.println("Input Fnewton :");
        Fnewton = EK.nextDouble();
        System.out.println("Input perpindahanbenda :");
        perpindahanBenda = EK.nextDouble();
        System.out.println("Input waktu :");
        waktu = EK.nextDouble();
        kecepatanAkhir = perpindahanBenda / waktu;
        energikinetik = 0.5 * massa * kecepatanAkhir * kecepatanAkhir;
        System.out.println("Gaya yang diterima adalah " + energikinetik);
        System.out.println("Kecepatan akhirnya adalah " + kecepatanAkhir);
        System.out.println("Input bilangangenap");
        if (energikinetik % 2==0) {
             System.out.println("Energi Kinetik adalah Bilangan Genap");
        }else
        System.out.println("Energi kinetik adalah Bukan bilangan Genap");












    }
}
