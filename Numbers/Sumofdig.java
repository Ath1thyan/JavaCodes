package Numbers;

import java.util.Scanner;

public class Sumofdig {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int r=0, s=0;
        while(n>0){
            r=n%10;
            n=n/10;
            //System.out.println(r);
        }
        System.out.println(s);
    }
}
