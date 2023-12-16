package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class InnerArrList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList <ArrayList<Integer>> li = new ArrayList<>();
        for (int i=0; i<3; i++){
            li.add(new ArrayList<Integer>());
        }
        for (int j=0; j<3; j++){
            for (int i=0; i<3; i++){
                li.get(i);
            }
        }
    }
}
