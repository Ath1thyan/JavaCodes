package oops;

class Student{  
    int rollno;  
    String name,course;  
    float fee;  
    Student(int rollno,String name,String course){  
        this.rollno=rollno;  
        this.name=name;  
        this.course=course;  
    }  
    Student(int rollno,String name,String course,float fee){  
        this(rollno,name,course);
        this.fee=fee;  
        //this(rollno,name,course);     //if this() is called as first statementin a constructor. if not, it gives Compile Time Error  
    }  
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
    }  
    class ThisTest2{  
        public static void main(String args[]){  
        Student s1=new Student(111,"ankit","java");  
        Student s2=new Student(112,"sumit","java",6000f);  
        s1.display();  
        s2.display();  
    }
}  
