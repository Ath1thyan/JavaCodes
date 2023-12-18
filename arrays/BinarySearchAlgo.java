package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("No. of elements : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the sorted array elements : ");
        for (int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Target value to search : ");
        int target = s.nextInt();
        System.out.print("Inserted array --> " + Arrays.toString(arr));
        System.out.println("Target Value --> " + target);
        binarySearch(arr, target);
        
    }

    static void binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start<=end){
            int mid = start + (end - start) /2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            if (target > arr[mid]){
                start = mid + 1;
            }
            if(target == arr[mid]) {
                System.out.println("Index of the target --> " + mid);
                break;
            }
            else{
                System.out.println("Targer not found !!!");
            }
            
        }
        
    }
}
