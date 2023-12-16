package oops;
class A{
     A(){
        this(5);
        System.out.println("constructor");
    }
    A(int x){
        System.out.println(x);
        //this.A();
    }
    void m1(){
        System.out.println("method m1");
    }
    void m2(){
        this.m1();
        System.out.println("method m2");
        // this.m1();
    }
    void a1(){
        System.out.println("hello");
    }
}
public class ThisTest1 {
    public static void main(String[] args) {
        A a = new A();
        //A a = new A(6);
        a.m2();
        //a.A(6);
    }
}
