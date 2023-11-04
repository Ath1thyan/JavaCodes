package Test_Program;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        int a=10; 
		int b=20;
		System.out.println("a==b : "+(a == b));
		System.out.println("a!=b : "+(a != b));
        final int x=-11, y=10, z=15;
        b = (x>y)?x:y;
        System.out.println(b);
        System.out.println(x>y && x>z);
        System.out.println(a +=2);
        System.out.println(b -=10);
        System.out.println(~x);
        System.out.println(-x);

        String res = (a < 15) ? "less than 15" : "greater than 15";
        System.out.println(res);

        if(x>y)
        System.out.println("y is greater");
        else if (y<15)
        System.out.println("z is greater");
        else
        System.out.println("else");

        if (x>0)
        System.out.println("x is positive");
        else if (x<0)
        System.out.println("x is negative");
        else 
        System.out.println("num is zero");
        System.out.println("--------------------------------------------------");

        if (y%2 ==0)
        System.out.println("y is even");
        else
        System.out.println("y is odd");

        System.out.println("--------------------------------------------------");

        for (int i = 0; i <= 2; i = i+1) {
             System.out.println(i);
            for (int j=0; j<=3; j=j+1){
                System.out.println(j);
            }
        }
        System.out.println("--------------------------------------------------");

        int i = 0;
        while (i < 5) {
        System.out.println(i);
        i++;
        }
        System.out.println("--------------------------------------------------");

        i = 10;
        do {
            System.out.println(i);
            i++;
        }
        while (i<15);

        int h = 20;
        while (h<=25){
            for (int s=2; s<=10;s++){
                System.out.println(s);
            }
            break;
        }

        Scanner g = new Scanner(System.in);
        int w;
        System.out.println("W : ");
        w= g.nextInt();
        System.out.println("The value of w is "+ w);

        Scanner Q = new Scanner(System.in);
        String q;
        System.out.println("string : ");
        q= Q.nextLine();
        System.out.println("The string is "+ q);


        Scanner k = new Scanner(System.in);
        String ntr;
        
        System.out.println("Enter the string: ");
        ntr=k.nextLine();
        System.out.println("The value of ntr is "+ ntr);

        Scanner fg = new Scanner(System.in);
        boolean gh;
        System.out.println("bool : ");
        gh= fg.nextBoolean();
        System.out.println("The string is "+ gh);

    }
}
