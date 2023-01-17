import java.util.ArrayList;
import java.util.Scanner;

public class jawabannomer3 {

    public static void main (String [] args){
      int jum= 4 ;
      jawabannomer3 myMessage = new jawabannomer3();
        Scanner sc = new Scanner(System.in);
        myMessage.setMessageID(sc.nextLine();
        myMessage.setMessageName (sc.nextLine());
        ArrayList<String>context = new ArrayList<>();
        for (int index = 0; index <jum; index++ ){
            context.add(sc.nextLine());
        }
        myMessage.setContext(context);
        System.out.println("kata yang di cari :" );
        String cari= sc.nextLine();
        System.out.println(myMessage.FindWords(context,cari));
    }
}
