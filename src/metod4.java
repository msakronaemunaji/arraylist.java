public class metod4 {

    public static int CetakAngka(){ // method jenis ke 3

        return 5;

    }
    public static String [] InputData(int a,double[] v){ // method jenis ke 4

        String [] kode = new String[] {"AB","CG","JK"};

        return kode;


        }
    public static void main(String[] args){

        int u = CetakAngka();
        System.out.println(u); // outputnya adalah 5

        double[] parameterKedua = new double[]{5.6,7.9};
        String[] t = InputData(2,parameterKedua);
        for( String s:t){
            System.out.println(s);
        }

    }



}
