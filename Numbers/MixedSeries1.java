package Numbers;

import java.util.Scanner;

public class MixedSeries1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(), odd=1, add, num=0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.print(odd+" ");
                odd+=2;
            }
            else{
                add=0;
                for(int j=0;j<=num;j++){
                    add=add+j;
                }
                num++;
                System.out.print(odd+" ");
            }
            
        }
    }
}
