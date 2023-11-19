package oops;

    class ParentClass {
        public int num1;
        public int num2;
    
        public ParentClass(int number1, int number2){
            num1 = number1;
            this.num2 = number2;
        }
        public void add(int addnum){
            num2 +=addnum;
        }
        public void sub(int subnum){
            num2 -=subnum;
        }
        public String result(){
            return ("num1 is : " + num1 + "\n" + "num 2 is : " + num2);
        }
    }

    class SubClass extends ParentClass{
        public int num3;

        public SubClass (int number1, int number2, int num4){
            super(number1, number2);
            num3=num4;
        }
        public void setnum(int newNum){
            num3 = newNum;
        }
        @Override public String result(){
            return (super.result() + "\n" +  "num1 is : " + num1 + "\n" + "num 2 is : " + num2);
        }
    }

public class SingleInheritance {

    
    public static void main(String[] args) {
        SubClass sc=new SubClass(1,2,3);
        System.out.println(sc.result());
    }
}

