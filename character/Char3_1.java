package character;

import java.util.Scanner;

public class Char3_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        int vp = fvp(input);
        int cp = fcp(input);
        int up = fup(input);
        int lp = flp(input);
        int wp = fwp(input);
        int sp = fsp(input);

        System.out.println("Vowel Position: " + vp);
        System.out.println("Consonant Position: " + cp);
        System.out.println("Uppercase Letter Position: " + up);
        System.out.println("Lowercase Letter Position: " + lp);
        System.out.println("Whitespace Position: " + wp);
        System.out.println("Special Character Position: " + sp);
    }

    public static int fvp(String str) {
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive search
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return i + 1; // Adding 1 to get 1-based position
            }
        }
        return -1; // Vowel not found
    }

    public static int fcp(String str) {
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive search
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                return i + 1; // Adding 1 to get 1-based position
            }
        }
        return -1; // Consonant not found
    }

    public static int fup(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                return i + 1; // Adding 1 to get 1-based position
            }
        }
        return -1; // Uppercase letter not found
    }

    public static int flp(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                return i + 1; // Adding 1 to get 1-based position
            }
        }
        return -1; // Lowercase letter not found
    }

    public static int fwp(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isWhitespace(ch)) {
                return i + 1; // Adding 1 to get 1-based position
            }
        }
        return -1; // Whitespace not found
    }

    public static int fsp(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                return i + 1; // Adding 1 to get 1-based position
            }
        }
        return -1; // Special character not found
    }
}
