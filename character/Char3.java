package character;

import java.util.Scanner;

public class Char3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        char ch[] = in.toCharArray();
        int vp = 0, cp = 0, up = 0, lp = 0, spcp = 0, spp = 0, dg=0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                if (ch[i] == 'a' || ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i'
                        || ch[i] == 'I' || ch[i] == 'o' || ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U' && vp == 0) {
                    vp = i + 1;
                } 
                else if (cp == 0 ) {
                    cp = i + 1;

                }
                if (up == 0 && Character.isUpperCase(ch[i])) {
                    up = i + 1;

                }
                if (lp == 0 && Character.isLowerCase(ch[i])) {
                    lp = i + 1;

                }
                

            }
            if (spp == 0 && Character.isWhitespace(ch[i])) {
                    spp = i + 1;
            }
            if (dg == 0 && Character.isDigit(ch[i])) {
                dg = i + 1;
            }

            else if (spcp==0){
                spcp++;
            }

            }

            System.out.println("vowel position : " + vp);
            System.out.println("consonant position : " + cp);
            System.out.println("UpperCase position : " + up);
            System.out.println("LowerCase position : " + lp);
            System.out.println("Space position : " + spp);
            System.out.println("SpecialCharacter Position : " + spcp);

        }
        

    }


