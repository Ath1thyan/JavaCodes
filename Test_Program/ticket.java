package Test_Program;

import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num[]=new int[n];
        for(int i=0; i<n; i++){
            num[i]=s.nextInt();
        }
        int date=s.nextInt();
        for(int i=0; i<n; i++){
            if(num[i]%date==0){
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        }
        s.close();
    }
}
