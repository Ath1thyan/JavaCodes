package Numbers;

import java.util.Scanner;

public class PrimeNum2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
