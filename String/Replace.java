package String;

public class Replace {
    public static void main(String[] args) {
        String s = "Hello world";
        String i1= "hello hello world";
        String i2 ="welcome hello world";
        System.out.println(s.replace("world", "all"));
        i1 = i1.replaceAll(i1, "hello world") ;
        i2 = i2.replaceAll(i2, "hello world") ;
        System.out.println(i2);
        System.out.println(i1);
    }
}
