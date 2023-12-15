package oops;

public class StaticKeyWord {
    int a =0;
    static int b=0;

    StaticKeyWord(){
        a++;
        b++;
        System.out.println("a --> " + a);
        System.out.println("b --> " + b);
    }
    public static void main(String[] args) {
        StaticKeyWord s1 = new StaticKeyWord();
        StaticKeyWord s2 = new StaticKeyWord();
        StaticKeyWord s3 = new StaticKeyWord();
    }
}
