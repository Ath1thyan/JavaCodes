package String;

import java.util.Scanner;

public class Order_swap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String str2[] =str.split(" ");
        for(int i=str2.length-1;i>=0;i--){
            System.out.print(str2[i]+" ");
        }
        s.close();
    }
}
