package Test_Program;
public class Getset {
    int emp_id;
    String emp_name;
    double salary;

    void setEmp(){
        emp_id=1;
        emp_name="Athi";
        salary=50009;
    }
    void getEmp(){
        System.out.println("id : "+emp_id);
        System.out.println("namee : "+emp_name);
        System.out.println("salary : "+salary);
    }
    public static void main(String[] args) {
        Getset obj = new Getset();
        System.out.println(obj.emp_id);
        obj.getEmp();
        obj.setEmp();
    }
}
