package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Oddeven_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of elements : ");
        int n = s.nextInt();
        int a[] = new int[n];
        int o[] = new int[n];
        int e[] = new int[n];
        int oi=0, ei=0;
        System.out.println("Enter the array elements : ");
        // ArrayList<Integer> odd = new ArrayList<Integer>();
        // ArrayList<Integer> even = new ArrayList<Integer>();

        for(int i=0; i<n; i++){
            a[i]=s.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int i=0; i<n; i++){
            System.out.print(a[i] +" ");
        }
        System.out.println();

        for(int i=0; i<n; i++){
            if(a[i] % 2 == 0){
                e[ei++]=a[i];
            }
            else{
                o[oi++]=a[i];
            }
        }

        System.out.println("odd : ");
        for(int i=0; i<=o[i]; i++){
            System.out.println(o[i]+" ");
        }

        System.out.println("even : ");
        for(int i=0; i<=e[i]; i++){
            System.out.println(e[i]+" ");
        }

        // for(int i=0; i<n; i++){
        //     if(a[i] % 2 == 0){
        //         even.add(a[i]);
        //     }
        //     else{
        //         odd.add(a[i]);
        //     }
        // }

        // System.out.println("even : "+even);

        // // for(int i=0;i<n;i++){
        // //     if(a[i] % 2 == 0){
        // //         System.out.print(a[i] + " ");
        // //     }
        // // }
        
        // System.out.println("odd : "+odd);

        // // for(int i=0;i<n;i++){
        // //     if(a[i] % 2 != 0){
        // //         System.out.print(a[i] + " ");
        // //     }
        // // }
        s.close();

    }
}
