package inheritancePrograms;

class Operation{
    int square(int r){
        return r*r;
    }
}
class Circle{
    Operation op;
    float pi = 3.14f;
    double area(int radius){  
        op=new Operation();  
        int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
        return pi*rsquare;  
    }  

    
}

public class Aggregation {
    public static void main(String[] args) {
        Circle c=new Circle();  
        double result=c.area(5);  
        System.out.println(result);  
    }
}
