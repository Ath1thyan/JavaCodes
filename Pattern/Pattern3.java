package Pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("no. of lines : ");
        int n = s.nextInt();
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=2; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        // for (int i=1; i<=n; i++){
        //     for(int j=n; j>i; j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }
        s.close();
    }
}
