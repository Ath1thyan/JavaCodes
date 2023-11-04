package Package_Java;

public class Sort {
    public static int[] method(){
        int arr[]=new int[]{7,6,5,4,3,2,1};
        for(int i=1;i<=arr.length-1;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
