package Test_Program;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        char s= a.next().charAt(0);
        switch(s){
            case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U':
            //case (s == 'a' | 'e' | 'i' | 'o' | 'u' | 'A' | 'E' | 'I' | 'O' | 'U'):
            System.out.println("vowel");
            break;
            default:
            System.out.println("not a vowel");  
        }
        a.close();
    }
}
