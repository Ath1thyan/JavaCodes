package Test_Program;

import java.util.Scanner;

public class Right_ang_tri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a=s.nextFloat(), b=s.nextFloat(), c=s.nextFloat();
        if(Math.pow(c,2) == (Math.pow(a, 2) + (Math.pow(b, 2)))){
            System.out.println("yes");
        }
        else{
            System.err.println("no");
        }
        s.close();
    }
}
