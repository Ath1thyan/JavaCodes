package inheritancePrograms;

class Sides{
    int hB(int h, int b){
        return h*b;
    }
}
class Rectangle{
    Sides sd;
    float half = 0.5f;
    double area(int hei, int br){
        sd = new Sides();
        int aRec = sd.hB(hei, br);
        return half * aRec;
    }
}

public class Aggregation2 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        double result = rec.area(10, 10);
        System.out.println(result);
    }
}
