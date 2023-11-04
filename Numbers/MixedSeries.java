package Numbers;

import java.util.Scanner;

public class MixedSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int fact, num=1, even=2;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                fact=1;
                for(int j=1; j<=num; j++){
                    fact = fact*j;
                }
                num++;
                System.out.print(fact+" ");
            }
            else{
                System.out.print(even+" ");
                even+=2;
            }
        }
    }
}
