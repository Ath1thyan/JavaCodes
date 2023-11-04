package Numbers;

import java.util.Scanner;

public class Abundant_num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("num: ");
        int n = s.nextInt();
        int sum=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum>n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        s.close();
    }
}
