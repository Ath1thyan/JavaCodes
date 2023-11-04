package Test_Program;

public class BubbleSort {
    public static void PrintArray(int arr[]) {
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[]={30,32,34,67,56};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        PrintArray(arr);
    }
}
