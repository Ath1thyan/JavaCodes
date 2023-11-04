package arrays;
import Package_Java.Sort;
import Package_Java.Sort_with_constructor;

public class Call_sort {
    public static void main(String[] args) {
        int[] array = Sort.method();
        for(int i:array){
            System.out.print(i + " ");
        }
        System.out.println();
        int[] arr1 = new int[]{9,8,7,6};
        int[] array1 = Sort_with_constructor.methodWithArgs(arr1);
        for(int i:array1){
            System.out.print(i + " ");
        }
    }
}
