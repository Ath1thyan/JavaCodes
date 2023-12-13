package oops;

public class DemoAtmLogic {
    int acc_no;
    String name;
    float amount;

    void insert(int a, String b, float c){
        this.acc_no = a;
        this.name = b;
        this.amount = c;
    }

    void disp(){
        System.out.println("Account number : "+acc_no);
        System.out.println("Account Holder name: "+name);
        System.out.println("Balance : "+amount);
    }

    void deposit(float a){
        amount = a + amount;
        System.out.println("Amount Deposited : " + a);
        System.out.println("Available balance : " + amount);
    }

    void withdraw(float a){
        if(amount > a){
            amount = amount - a;
            System.out.println("Amount withdrawn : " + a);
            System.out.println("Available balance : " + amount);
        }
        else{
            System.out.println("Insufficiant balance");
            System.out.println("Available balance : " + amount);
        }
    }
}
