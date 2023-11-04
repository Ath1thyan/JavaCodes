package Numbers;

import java.util.Scanner;

public class Neon_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = (int)Math.pow(n,2);
        int qr=0;
        while(a>0){
            int q=a%10;
            int r=a/10;
            qr=q+r;
        }
        if (qr==n)
        System.out.println("neon num");
        else
        System.out.println("not");
    }
}
