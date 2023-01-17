import java.util.ArrayList;

public class InstaBro {

    private String UserID;
    private String UserName;
    private String FullName;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public ArrayList<String> getSnap() {
        return Snap;
    }

    public void setSnap(ArrayList<String> snap) {
        Snap = snap;
    }

    private ArrayList<String> Snap;

    public InstaBro(){

        System.out.println("Constructor tanpa parameter......");

    }
    public InstaBro (String id, String usr,String name , ArrayList<String> snap){
     this.UserID = id;
     this.UserName = usr;
     this.FullName = name;
     this.Snap = snap;

    }

    public static void main (String[] args){
        InstaBro user1 = new InstaBro();
        user1.setUserID("001");
        user1.setUserName("bagong");
        user1.setFullName("ABC");


        ArrayList<String>postingan = new ArrayList<>();
        postingan.add("hallo");
        postingan.add("yuhuuu");
        postingan.add("balik yuh");
        user1.setSnap(postingan);

        //mengambil value dari entity dari Object
        System.out.println("Mengambil value dengan Getter");
        System.out.println(user1.getUserID());
        System.out.println(user1.getUserName());
        System.out.println(user1.getFullName());

        System.out.println("Snaps are : ");

        // for (int i = 0; i <postinga.size();i++){
        for (String p : postingan ){
            System.out.println(p);
        }





    }
}
