package Pattern;

import java.util.Scanner;

public class Num_change_pyr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(), num=1;

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
