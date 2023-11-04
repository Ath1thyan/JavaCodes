package Test_Program;

public class Foreach {
    public static void main(String[] args){
        int[] num = {1,2,3,4,5};
        String[] cars = {"volvo", "bmw", "bently", "aston martin"};
        for(int i : num){
            System.out.print(i + " ");
        }
        System.out.println("\t");
        // for(int i=0; i<num.length; i++){
        //     System.out.println(num[i] + " ");
        // }
        for (String i : cars){
            System.out.print(i + " ");
        }
        // for(int i=0; i<num.length; i++){
        //     System.out.println(cars[i] + " ");
        //  }
    }
}
