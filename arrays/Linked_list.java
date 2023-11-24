package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_list {
    public static void main(String[] args) {
        LinkedList<String> car = new LinkedList<String>();
        ArrayList<String> bike = new ArrayList<String>();
        List<Integer> num=new ArrayList<Integer>();
        bike.add("Duke");
        car.add("bently");
        System.out.println(car);
        System.out.println(bike);
        String a = bike.toString();
        String b = a.toLowerCase();
        System.out.println(b);
        
    }
}
