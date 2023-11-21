package Test_Program;

import java.util.Scanner;

public class IndexPositionLogic {
    String s = "RanjithKumar";
    Scanner sc = new Scanner(System.in);
    char c = sc.next(). charAt(0);
    char str[] = s.toCharArray();
    void method(){
        for(int i=0; i<str.length; i++){
            if(c==str[i]){
                System.out.println(i);
            }
        }
    }
    void method2(){
        for(int i=0; i<str.length; i++){
            for(int j=1; j<str.length; j++){
                if(str[i]==str[j]){
                    System.out.print(str[j]);
                }
            }
        }
    }
}
