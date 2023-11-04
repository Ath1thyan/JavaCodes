package Numbers;

import java.util.Scanner;

public class num_in_btwn {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(), l=s.nextInt(), r=s.nextInt();
        if(n>l && n<r){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
