package inheritancePrograms;
class Car{
    void brand(){
        System.out.println("Volvo");
    }
}
class Model extends Car{
    void variant(){
        System.out.println("XC90");
    }
}
class Year extends Model{
    void yr(){
        System.out.println("2019");
    }
}
public class Multilevelnherit {
    public static void main(String[] args) {
        Year obj = new Year();
        obj.brand();
        obj.variant();
        obj.yr();
    }
}


// Hierarchical Inheritance 
// When two or more classes inherits a single class, it is known as hierarchical inheritance. In the example given below, Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.

