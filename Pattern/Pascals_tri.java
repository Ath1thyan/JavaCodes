package Pattern;

import java.util.Scanner;

public class Pascals_tri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if (j==1 || j==i){
                    System.out.print(1 +" ");
                }
                else{
                    System.out.print(i-1 +" ");
                }
            }
            System.out.println();
        }
    }
}
