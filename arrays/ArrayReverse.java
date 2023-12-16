package arrays;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,5,4,6,3,7,0};
        System.out.println("Input Array --> " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed Array --> " + Arrays.toString(arr));
        sort(arr);
    }
    static void swap(int[] arr, int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind1]= arr[ind2];
        arr[ind2] = temp;
    }
    static void reverse(int[] arr){
        int start = 0, end = arr.length-1;
        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void sort(int[] arr){
        //System.out.println(Integer.MAX_VALUE);

    }
}
