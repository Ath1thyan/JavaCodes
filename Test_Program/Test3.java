package Test_Program;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input: ");
        int n=s.nextInt();
        //Initialized array length
        int  array[] = new int[n];
        int  odd[] = new int[n];
        int  even[] = new int[n];

        //for reading array elements from user
        for(int i=0;i<n;i++){
            array[i]=s.nextInt();
        }
        //for displaying
        System.out.println("array elements are: ");
        for(int i = 0;i<n;i++){
            System.out.println(array[i]);
        }
        

        for(int i =0;i<n;i++){
            if(array[i]%2==0){
                int even[i]=array[i];
            }else {
                int odd[i]=array[i];
            }
        }
        int od = odd.size();
        System.out.println("Odd: ");
        for(int i = 0; i< (odd[i]);i++){
            
            System.out.println(odd[i]+ ",");
        }
        System.out.println("Even: ");
        for(int i = 0; i< n;i++){
            System.out.println(even[i]+",");
        }

    }

}
