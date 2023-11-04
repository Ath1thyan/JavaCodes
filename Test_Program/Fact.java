package Test_Program;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int r = 1;
        for(int i=n; i>=1; i--){
            r *= i;
        }
        System.out.println(r);
        a.close();
    }
}
