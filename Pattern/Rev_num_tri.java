package Pattern;

import java.util.Scanner;

public class Rev_num_tri {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=0; j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i; j<=n; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
