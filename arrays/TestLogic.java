package arrays;

public class TestLogic {
    public static void main(String[] args) {
        int arr[] = new int[]{7,8,12,6,3,4,1,9,7,6,1,4};
        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
        System.out.println();
    }
}
