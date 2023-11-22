package Test_Program;

public class LetterSpace {
    public static void main(String[] args) {
        String i = "welcome";
        String j ="World";
        char[] c = i.toCharArray();
        i = String.join(" ",i.split(""));
        System.out.println(i);
        System.out.println(j.replace("",  " ").substring(1));
    }
}
