package Numbers;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt(), n2=s.nextInt(), gcd=0, lcm;
        for(int i=1; i<=n1 && i<=n2; i++){
            if(n1%i==0 && n2%i==0){
                gcd= i;
            }
        }
        lcm=(n1*n2)/gcd;
        System.out.println("lcm: "+lcm +" "+"gcd: "+gcd);
    }
}
