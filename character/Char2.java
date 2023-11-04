package character;

import java.util.Scanner;

public class Char2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        char ch[] = in.toCharArray();
        int al=0, dg=0, sp=0, sp1=0, v=0, c=0, spc=0;
        for(int i=0; i<ch.length;i++){
            if(Character.isLetter(ch[i])){ // by converting the input string into character array and using character methods
                al++; 
                
                if(ch[i]=='a' || ch[i]=='A' || ch[i]=='e' || ch[i]=='E' || ch[i]=='i'
                    || ch[i]=='I' || ch[i]=='o' || ch[i]=='O' || ch[i]=='u' || ch[i]=='U'){
                        v++;
                    }
                    
                else  {
                    c++;
                }
            }
            
            else if(Character.isDigit(in.charAt(i))){ // by converting the string into array
                dg++;             
            }
            
            else if(in.charAt(i)==' '){
                sp++;
            }

            else if(Character.isWhitespace(ch[i])){ // using the character modifiers
                sp1++;
            }

            else{
                spc++;
            }

        }
        System.out.println("Alphabet : "+al);
        System.out.println("Digit : "+dg);
        System.out.println("Space : "+sp);
        System.out.println("Space : "+sp1);
        System.out.println("Vowel : "+v);
        System.out.println("Consonant : "+c);
        System.out.println("Special char : "+spc);
        s.close();
    }
}

