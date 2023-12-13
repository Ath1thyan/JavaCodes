package oops;

class car{
    String name;
    String model;
    void brand(String n, String m){
        this.name =n;
        model =m;
    }
    void disp(){
        System.out.println(name + " --> " + model);
    }
}
public class ObjInitializeThroughMethod {
    public static void main(String[] args) {
        // car c1 = new car();
        // car c2 = new car();
        car c1 = new car(), c2 = new car();
        c1.brand("Volvo", "XC60");
        c2.brand("RangeRover", "Velar");
        c1.disp();
        c2.disp();
    }
}
