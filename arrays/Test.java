package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = s.nextInt();
            }
        }
        for (int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("---------------------------");
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.println("---------------------------");
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
