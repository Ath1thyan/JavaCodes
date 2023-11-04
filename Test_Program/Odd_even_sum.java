package Test_Program;

import java.util.Scanner;

public class Odd_even_sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt(), n2=s.nextInt(), sum=0;
        sum=n2+n1;
        if(sum%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        s.close();
    }
}
