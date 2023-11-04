package character;

import java.util.Scanner;

public class Char3_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = s.nextLine();

        printPosition("Vowel", findFirstPosition(input, c -> "aeiouAEIOU".contains(String.valueOf(c))));
        printPosition("Consonant", findFirstPosition(input, c -> Character.isLetter(c) && !"aeiouAEIOU".contains(String.valueOf(c))));
        printPosition("Uppercase Letter", findFirstPosition(input, Character::isUpperCase));
        printPosition("Lowercase Letter", findFirstPosition(input, Character::isLowerCase));
        printPosition("Whitespace", findFirstPosition(input, Character::isWhitespace));
        printPosition("Special Character", findFirstPosition(input, c -> !Character.isLetterOrDigit(c) && !Character.isWhitespace(c)));
    }

    public static int findFirstPosition(String str, CharacterCondition condition) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (condition.test(ch)) {
                return i + 1; // Adding 1 to get 1-based position
            }
        }
        return -1; // Character not found
    }

    public static void printPosition(String type, int position) {
        if (position != -1) {
            System.out.println("First " + type + " Position: " + position);
        } else {
            System.out.println(type + " not found.");
        }
    }
}

@FunctionalInterface
interface CharacterCondition {
    boolean test(char c);
}