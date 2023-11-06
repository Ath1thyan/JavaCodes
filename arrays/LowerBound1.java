package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LowerBound1 {
    public static void method(int arr[], int key, int i){
        if(key==arr[i]){
            System.out.println("index: "+i);
            System.out.println("position: "+ (i+1));
        }
        else{
            method(arr, key, i+1);
        }
    }
    public static void main(String[] args) {
        int arr[]= {9,10,12,22,49,58,78,100};
        int i=0;
        Scanner s= new Scanner(System.in);
        System.out.println("key: ");
        int key=s.nextInt();
        Arrays.sort(arr);
        method(arr, key, i);
    }
}
