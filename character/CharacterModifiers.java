package character;

public class CharacterModifiers {
    public static void main(String[] args) {
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.isLowerCase('H'));
        System.out.println(Character.isLetter('a'));
        String str = "hello";
        char ch[] = str.toCharArray();
        for(int i=0; i<ch.length; i++)
        System.out.println(ch[i]);
        
    }
}
