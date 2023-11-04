package Test_Program;

import java.util.Scanner;

public class Arr_contains {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(), k=s.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        for(int i=0; i<n; i++){
            if(a[i]==k){
                System.out.println("yes");
                break;
            }
            // else{
            //     System.out.println("no");
            //     break;
            // }
        }
        
    }
}
