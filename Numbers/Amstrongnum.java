package Numbers;

public class Amstrongnum {
    public static void main(String[] args) {
        int a =153, rem, temp=a, sum=0, cube;
        while (a>0) {
            rem = a%10;
            a=a/10;
            sum = sum+ rem*rem*rem;
        }
        if(sum == temp){
            System.out.println("amstrong num");
        }
        else{
            System.out.println("not amstrong");
        }
    }
}
