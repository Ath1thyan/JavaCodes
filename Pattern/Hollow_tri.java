package Pattern;

import java.util.Scanner;

public class Hollow_tri {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2 * i - 1);j++){
                if(j==1 || i==n || j==(2 * i - 1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // for(int i=1;i<=n-1;i++){
        //     System.out.print("**");
        // }
        // for(int i=n; i<=n;i++){
        //     System.out.print("*");
        // }
    }
}
