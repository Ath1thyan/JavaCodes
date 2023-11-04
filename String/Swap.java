package String;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str= s.next();
        char ch[]=str.toCharArray();
        if(str.length()%2==0){
            for(int i=1; i<str.length(); i+=2){
                System.out.print(ch[i]+""+ch[i-1]);
            }
        }
        else{
            for(int i=0; i<str.length()-1; i+=2){
                System.out.print(ch[i+1]+""+ch[i]);
            }
            System.out.print(ch[str.length()-1]);
        }
    }
}
