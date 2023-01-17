public class LATIHANSOAL2 {

    public static String RemoveHurufVocal(String Kalimat) {



        return Kalimat.replaceAll("[a i u e o]", " ");



    }


        public static void main (String[]args){

            System.out.println(RemoveHurufVocal("Kemarin saya pergi kepasar"));
        }
    }
