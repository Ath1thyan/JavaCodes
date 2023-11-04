package arrays;

import java.util.Scanner;

public class Array_occurence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("num of elements: ");
        int n = s.nextInt();
        System.out.println("array elements: ");
        int a[] = new int[n];
        int c=0;
        for(int i=0; i<n; i++){
            a[i]= s.nextInt();
        }

        System.out.println("to find: ");
        int b = s.nextInt();

        for(int i=0; i<n; i++){
            if(a[i]==b){
                c++;
            }
        }
        System.out.println("no. of occurence: "+c);
        // if(c>0){
        //     System.out.println(c);
        // }
        // else{
        //     System.out.println(c);
        // }
        s.close();
    }
}
