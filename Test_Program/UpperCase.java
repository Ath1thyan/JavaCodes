package Test_Program;

import java.util.*;

public class UpperCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char strArr[] = str.toCharArray();
        for (int i=0; i<strArr.length; i++){
            if (strArr[i]>='a' && strArr[i]<='z'){
                strArr[i] = (char) ((int)(strArr[i] - 32));
            }
        }
        for(int i=0;i<strArr.length;i++){
    			System.out.print(strArr[i]);
        }
        System.out.println();
    }
    
}
