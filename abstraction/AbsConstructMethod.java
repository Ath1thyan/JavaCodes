package abstraction;

abstract class InnerAbsConstructMethod {
    abstract void year();
    void car(){
        System.out.println("volvo");
        System.out.println("S90");
    }
    InnerAbsConstructMethod(){
        System.out.println("parent class constructor is called...");
    }
}

class InnerAbsConstructMethod_1 extends InnerAbsConstructMethod {
    void year(){
        System.out.println("2019");
    }
    InnerAbsConstructMethod_1(){
        System.out.println("child class Constructor is called");
    }
}

public class AbsConstructMethod {
    public static void main(String[] args) {
        InnerAbsConstructMethod_1 obj = new InnerAbsConstructMethod_1();
        obj.car();
        obj.year();
    }
}
