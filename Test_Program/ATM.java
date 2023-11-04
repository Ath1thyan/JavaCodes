package Test_Program;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice, amount, bal=20000;
        char ch;
        do{
            System.out.println("1.Withdrawl");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println();
            System.out.println("Enter your choice: ");
            choice = s.nextInt();

            switch(choice){
                case 1:
                System.out.println("Enter the amount: ");
                amount=s.nextInt();
                bal=bal-amount;
                System.out.println("balance: "+bal);
                break;

                case 2:
                System.out.println("Enter the amount: ");
                amount=s.nextInt();
                bal=bal+amount;
                System.out.println("balance: "+bal);
                break;

                case 3:
                System.out.println("balance: "+bal);
                break;

                case 4:
                System.out.println();
                System.out.println("Exiting...");
                System.out.println("Thank You... Welcome Again :)");
                System.exit(0);
                break;

                default:
                System.out.println("invalid input");
            }
            System.out.println();
            System.out.println("Do you want to continue? y or n: ");
            ch=s.next().charAt(0);
        }while(ch=='y' || ch=='Y');
        System.out.println("Thank You... Welcome Again :)");
    }
}
