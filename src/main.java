import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner hassan = new Scanner(System.in);
        System.out.println("Input Pasword :");
        String password = hassan.nextLine();
        if(password.equals("javaclass")){
            System.out.println("Password benar");
        }
        else {
            System.out.println("Password salah");
        }

    }

}