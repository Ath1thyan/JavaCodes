package Obj_class;

public class Clobj1 {
    int id=1;
    String name="Joseph";

    void print(){
        System.out.println("id : " +id);
        System.out.println("name: " +name);
    }
    public static void main(String[] args){
        Clobj1 obj = new Clobj1();
        obj.print();
    }
}
