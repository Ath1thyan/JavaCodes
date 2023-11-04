package Numbers;

import java.util.Scanner;

public class Swap_num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(), arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
        if(arr.length%2==0){
            for(int i=1;i<n;i+=2){
                System.out.println(arr[i]+" "+arr[i-1]+" ");
            }
        }
        else{
            for(int i=0;i<n-1;i+=2){
                System.out.print(arr[i+1]+" "+arr[i]+" ");
            }
            System.out.print(arr[n-1]);
        }
    }
}
