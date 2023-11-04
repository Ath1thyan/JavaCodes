package String;

public class String1 {
    public static void main(String[] args) {
        String str = "Hello World";
        String astr = " hello world";
        Object objstr = str;

        System.out.println(str.compareTo(astr));
        System.out.println(str.compareToIgnoreCase(astr));
        System.out.println(str.compareTo(objstr.toString()));
    }
}
