package arrays;

import java.util.Scanner;

public class Arr_small_ele {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int max=a[0];
        int min=a[0];
        int sl=a[0];
        for(int i=0; i<n; i++){
            if(a[i] > max){
                max = a[i];
                sl=a[i] - max;
            }
            if(a[i]<min){
                min=a[i];
            }
        }

        System.out.println("max: "+max);
        System.out.println("min: "+min);
        System.out.println(sl);
        s.close();
    }
}
