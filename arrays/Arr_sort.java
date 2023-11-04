package arrays;

import java.util.Scanner;

public class Arr_sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(), temp=0;
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        for(int i=0; i<=n-1; i++){
            for(int j=i+1;j<=n-1;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println();
        for (int i = 0; i <=n-1; i++) {     
            System.out.println(arr[i] + " ");    
        }    
            
    }
}

