package Package_Java;

public class Sort_with_constructor {
    int[] arr1;
    public Sort_with_constructor(int arr1[]){
        this.arr1=arr1;
    }

    public static int[] methodWithArgs(int[] arr1){
        for(int i=1;i<=arr1.length-1;i++){
            for(int j=0;j<arr1.length-i;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        return arr1;
    }
}
