package String;

public class String2 {
    public static void main(String[] args) {
        String str = "hello world, hello reader";
    int li= str.lastIndexOf("hello");
    if(li==-1){
        System.out.println("not found");
    }
    else{
        System.out.println("last occurence of hello is at index "+li);
    }
    }
    
}
