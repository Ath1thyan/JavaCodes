package arrays;

import java.util.Scanner;

public class Arr_sec_larg_ele {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int temp;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }   
        }
        System.out.println("second largest: "+arr[n-2]);
        System.out.println("smallest: "+arr[0]);
        s.close();
    }
}
