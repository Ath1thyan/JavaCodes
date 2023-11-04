package Numbers;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str = s.next();
        StringBuffer strb= new StringBuffer(str);
        if(str.equalsIgnoreCase(strb.reverse().toString()))
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
        s.close();
    }
}
