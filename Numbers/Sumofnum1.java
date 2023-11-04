// sum of n natural numbers
package Numbers;
import java.util.Scanner;

public class Sumofnum1 {
    public static void main(String[] args){
        Scanner a = new Scanner (System.in);
        long n = a.nextLong();
        long s=0;
        for(long i=0;i<=n;i++){
            s+=i;   //s=s+i;
        }
        System.out.println("sum : " +s);
        a.close();
    }
}
 