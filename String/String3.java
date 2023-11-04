package String;

public class String3 {
    public static void main(String[] args) {
        String s = "abcdef 1234";
        String r = new StringBuffer(s).reverse().toString();
        System.out.println("before reversed : "+s);
        System.out.println("after reversed : "+r);

        String s1 = "qwertyuiop";
        char[] r1 = s1.toCharArray();

        for(int i=r1.length-1; i>=0;i--){
            System.out.print(r1[i]);
        }
        System.out.println();

        String t = "the cat is on the table";
        System.out.println(t.contains("the"));
    }
}
