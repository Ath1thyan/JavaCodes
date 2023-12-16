package inheritancePrograms;

class A{
    int a=10;
}

class Program1 extends A {
    int b=5;
    public static void main(String[] args) {
        Program1 o = new Program1();
        System.out.println(o.a + o.b);
    }
}
