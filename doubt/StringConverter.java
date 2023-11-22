package doubt;

public class StringConverter {
    public static String changeKthToUpperCase(String s, int k) {
        if (s == null || s.isEmpty() || k <= 0) {
            return s; // If the string is null/empty or k is non-positive, return the input string.
        }

        char[] chars = s.toCharArray();
        for (int i = k - 1; i < s.length(); i += k) {
            chars[i] = Character.toUpperCase(chars[i]); // Change every kth character to uppercase.
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "string";
        int k = 2;
        String output = StringConverter.changeKthToUpperCase(input, k);
        System.out.println(output); // This will print: sTrInG
    }
}
