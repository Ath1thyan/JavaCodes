package Test_Program;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        char c = a.next().charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
        {
            System.out.println("vowel");
        }
        else{
            System.out.println("not a vowel");
        }
        a.close();
    }
}
