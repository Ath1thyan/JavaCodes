package Access_modifiers;

class Base{
     int x=12;
    protected int y=13;
    void dis(){
        System.out.println(x);
        System.out.println(y);
    }
}
public class Private_class {
    public int a=10;
    public int b=20;

    public static void main(String[] args){
        Private_class obj = new Private_class();
        Base obj1 = new Base();
        System.out.println("a= "+obj.a);
        System.out.println("b= "+obj.b);
        System.out.println("x= "+obj1.x);
        System.out.println("y= "+obj1.y);
        obj1.dis();
    }
}
