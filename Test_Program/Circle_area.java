package Test_Program;

import java.util.Scanner;

public class Circle_area {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("radius: ");
        float r=s.nextFloat();
        float a, pi=3.14f;
        a= pi* r*r;
        //System.out.println(String.format("%.2f", a));
        System.out.println("area of circle: "+String.format("%.2f",a));

        s.nextLine();
        System.out.println("enter 2 num: ");
        String r1=s.nextLine();
        String r2[] = r1.split(" ");
        int a1=Integer.parseInt(r2[0]);
        int b1=Integer.parseInt(r2[1]);
        System.out.println((int)Math.pow(a1, b1));

        // System.out.println("enter 2 num: ");
        // int n1=s.nextInt();
        // int n2=s.nextInt();
        // if(1<=n1 && n1<=5 && n2>=1 && n2<=50)
        // System.out.println((int)(Math.pow(n1, n2)));
        s.close();
    }
}
