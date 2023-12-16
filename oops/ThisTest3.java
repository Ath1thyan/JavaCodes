package oops;
class S1{
    void m1(S1 obj){
        System.out.println("method invoked");
    }
    void m2(){
        m1(this);
    }
}
public class ThisTest3 {
    public static void main(String[] args) {
        S1 o = new S1();
        o.m2();
    }
}
