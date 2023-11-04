package Test_Program;

import java.util.Scanner;

public class Triangle_area {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        float b=s.nextFloat(); 
        float h=s.nextFloat();
        float a=0.00f;
        a=(b*h)/2;
        System.err.println(String.format("%.2f", a));
    }
}
