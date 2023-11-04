package Test_Program;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int id, sal , bsal;
        long ph;
        String name, add;
        //System.out.println("id");
        id = a.nextInt();
        name = a.next();
        add = a.nextLine();
        a.nextLine();
        ph = a.nextLong();
        sal = a.nextInt();
        System.out.println("id : " + id);
        System.out.println("name : " + name);
        System.out.println("address : " +add);
        System.out.println("phone num : " + ph);

        if(sal>40000){
            bsal=sal+8000;
            System.out.println("Net salary : " +bsal);
        }
        else if(sal>30000){
            bsal=sal+7000;
            System.out.println("Net salary : " +bsal);
        }
        else if(sal>20000){
            bsal=sal+5000;
            System.out.println("Net salary : " +bsal);
        }
        else if(sal>10000){
            bsal=sal+3000;
            System.out.println("Net salary : " +bsal);
        }
        a.close();
    }
}
