package abstraction;

abstract class InnerAbstractClassMethod {
    abstract void method();
}

class InnerAbstractClassMethod_1 extends InnerAbstractClassMethod {
    void method(){
        String brand = "volvo";
        String model = "xc60";
        System.out.println(brand);
        System.out.println(model);
    }    
}

public class AbstractClassMethod {
    public static void main(String[] args) {
        InnerAbstractClassMethod_1 obj = new InnerAbstractClassMethod_1();
        obj.method();
    }
}
