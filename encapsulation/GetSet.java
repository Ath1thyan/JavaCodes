package encapsulation;

class Data{
    private String brand;
    private String model;

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public void setBrand(String b){
        brand = b;
    }
    public void setModel(String m){
        model = m;
    }
}

public class GetSet {
    public static void main(String[] args) {
        Data obj = new Data();
        obj.setBrand("Porsche");
        obj.setModel("cayenne");

        System.out.println("Brand : " + obj.getBrand());
        System.out.println("Model : " + obj.getModel());
    }
}
