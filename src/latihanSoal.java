import java.util.Arrays;

public class latihanSoal {

    public static String HighLow (String numbers) {
        String[] NUMBERS = numbers.split(" ");
        int [] mynumbers = new int [NUMBERS.length];
        for (int index = 0; index <NUMBERS.length; index++){

            mynumbers[index] = Integer.parseInt(NUMBERS[index]);


        }

        Arrays.sort(mynumbers);

        String max = String.valueOf(Arrays.stream(mynumbers).max());
        String min =  String.valueOf(Arrays.stream(mynumbers).min());




        return max + "" + min ;


    }


        public static void main(String[] args){

        System.out.println(HighLow( "8 3 -5 42 -1 0 0 -9 4 7 4 -4 "));




    }

    public static String HighLow (String str){
         var stat = stream (str.split(" ")).mapToInt(Integer::parseInt).
                 summaryStatistics();
         return stat.getMax+ " "+ stat.get.Min;


    }

}
