package stack;

import java.util.Stack;

public class Program1 {
    public static void main(String[] args) {
        Stack <Integer> stk=new Stack<>();
        System.out.println(stk.empty());
        stk.push(12);
        stk.add(13);
        System.out.println(stk);
        System.out.println(stk.empty());
        System.out.println(stk.peek());
        System.out.println(stk.search(12));
        System.out.println(stk.clone());
        System.out.println(stk.hashCode());
        System.out.println(stk.capacity());
        System.out.println(stk.contains(12));
        System.out.println(stk.parallelStream());
        stk.pop();
        System.out.println(stk.empty());
    }
}
