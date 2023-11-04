package Obj_class;

import java.util.Scanner;

public class Clobj2 {
    int id=1;
    String name="Joseph";

    void print(int s_id, String s_name){
        id = s_id;
        name = s_name;
        System.out.println("id : " +id);
        System.out.println("name: " +name);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the id: ");
        int s_id=s.nextInt();
        System.out.println("Enter name: ");
        String s_name = s.next();
        Clobj2 obj = new Clobj2();
        obj.print(s_id,s_name);
        s.close();
    }
}
