package Test_Program;

// Test Program
public class Test {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(5*4);
		System.out.println(true);
		
		int a = 5, b=11, c=a+b;
		System.out.println(a+b);
		System.out.println("Sum is : " +c);
		System.out.println("--------------------------------------------------");
		
		float f=1.07f;
		double db=123.97624d;
		int myInt = (int) db;
		double myDouble = myInt;
		char ch='D';
		String str="Hello";
		String str1="World";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.indexOf("a"));
		System.out.println(str + " " + str1);
		System.out.println(str.concat(str1));
		boolean boool=false;
		
		System.out.println(f);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(boool);
		System.out.println("--------------------------------------------------");
		System.out.println(Math.max(5, 10));
		System.out.println(Math.min(5, 10));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.abs(-4.7));
		System.out.println(Math.random());
		System.out.println(Math.random() * 101);
		System.out.println("this\nis\tprint\nstatement");
		System.out.println("\"HELLO\" world");
		System.out.println(db);
		System.out.println(myInt);
		System.out.println(myDouble);

	}

}
