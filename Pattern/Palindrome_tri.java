package Pattern;

import java.util.Scanner;

public class Palindrome_tri {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=i; j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
