package Pattern;

import java.util.Scanner;

public class Butterfly_star {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
