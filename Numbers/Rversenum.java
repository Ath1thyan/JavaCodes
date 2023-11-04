package Numbers;
import java.util.Scanner;
public class Rversenum {
    public static void main(String[] args){
        Scanner a= new Scanner(System.in);
        String n = a.nextLine();
        int l = n.length();
        char c;
        String s="";
        for(int i=0; i<l; i++){
            c = n.charAt(i);
            s = c+s;
        }
        System.out.println(s);
    }
}
