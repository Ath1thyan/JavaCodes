package Test_Program;

import java.util.Scanner;

public class Avgmark {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int id, m1, m2, m3, tot, avg;
        System.out.println("id : ");
        id = a.nextInt();
        String name;
        System.out.println("name");
        name = a.next();
        System.out.println("m1 : ");
        m1 = a.nextInt();
        System.out.println("m2 : ");
        m2 = a.nextInt();
        System.out.println("m3 : ");
        m3 = a.nextInt();
        tot=m1+m2+m3;
        avg=tot/3;

        if(avg>=90){
            System.out.println("Excellant");
        }
        else if (avg>=80){
            System.out.println("very good");
        }
        else if (avg>=70){
            System.out.println("good");
        }
        else if (avg>=60){
            System.out.println("have to improve");
        }
        else if (avg>=50){
            System.out.println("work hard");
        }
        else{
            System.out.println("fail");
        }
        a.close();
    }
}
