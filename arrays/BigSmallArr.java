package arrays;

import java.util.Scanner;

public class BigSmallArr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a value to find its index: ");
        int t=s.nextInt();
        int arr[] = new int[]{9,7,8,6,3,1,12,2,5}, max=0, min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]==t){
                System.out.println("target index: "+ i);
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
