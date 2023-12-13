package oops;

class Parent1{
    public void method(){
        System.out.println("parent 1");
    }
}
class Parent2 extends Parent1{
    public void method(){
        System.out.println("parent 2");
    }
}
class child1 extends Parent2{
    public boolean method(){
        System.out.println("child");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        child1 obj = new child1();
        System.out.println(obj.method());
        
    }
}
