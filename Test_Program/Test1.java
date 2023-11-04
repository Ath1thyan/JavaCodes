package Test_Program;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        Scanner keyv = new Scanner (System.in);
        int key;
        System.out.println("enter the key : ");
        key = keyv.nextInt();
        switch (key) {
            case 1:
            System.out.println("1st case");
            break;

            case 2:
            System.out.println("2nd case");
            break;

            default:
            System.out.println("Default case");
            break;
        }
        // String[] cars = {"volvo", "audi", "Ford", "bently"};
        // for (String k : cars){
        //     System.out.println(k);
        // }
        // for (int i=0; i<cars.length; i++){
        //     System.out.println(cars[i]);
        // }

    }
}
