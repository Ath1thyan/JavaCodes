package Class;

class A{
    interface B{
        void msg();
    }
}
class NestedClass implements A.B {
    public void msg(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        A.B obj = new NestedClass();
            obj.msg();
        
    }
}
