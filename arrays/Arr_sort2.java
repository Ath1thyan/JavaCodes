package arrays;

public class Arr_sort2 {
    public static void main(String[] args) {
        int arr[]=new int[]{7,6,5,4,3,2,1};
        for(int i=0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]) {
                int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    i=-1;
            }
        }
        System.out.println();
        for (int i = 0; i <=arr.length-1; i++) {     
            System.out.println(arr[i] + " "); 
        }
    }
}
