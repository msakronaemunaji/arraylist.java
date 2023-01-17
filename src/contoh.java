import java.util.Scanner;

public class contoh {
       //Untuk menunggu inputan dari user menggunakan
    public static void main(String[] args) {
          //scanner
           String studentName;
           int studentAge;
           Scanner dava =
                   new Scanner(System.in);
           System.out.println("Input fullname : ");
           studentName = dava.nextLine();
           System.out.println("Input Age : ");
           studentAge = dava.nextInt();
           System.out.println("Your Fullname is" + studentName);
           System.out.println("Your Age is " + studentAge);

           System.out.println();



    }
}