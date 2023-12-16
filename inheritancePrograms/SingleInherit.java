package inheritancePrograms;

// class A{
//     void m1(){
//         System.out.println("from m1");
//     }
// }
// class B extends A{
//     void m2(){
//         System.out.println("from m2");
//     }
// }

// public class SingleInherit {
//     public static void main(String[] args) {
//         B obj = new B();
//         obj.m2();
//         obj.m1();
//     }
// }


class Animal{  
    void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
    void bark(){System.out.println("barking...");}  
}  
class SingleInherit{  
    public static void main(String args[]){  
        Dog d=new Dog();  
        d.bark();  
        d.eat();  
}}  