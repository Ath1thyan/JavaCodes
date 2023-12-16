package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i=0; i<n; i++){
            li.add(s.nextInt());
        }
        for (int j=0; j<n; j++){
            System.out.println(li.get(j));
        }   
    }
}
