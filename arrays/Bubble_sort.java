package arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int arr[]=new int[]{7,6,5,4,3,2,1};
        int flag=0;
        for(int i=1;i<=arr.length-1;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag++;
                }
            }
        }
        System.out.println();

        if(flag==0){
            System.out.println("Already sorted");
        }
        else{
            for (int i = 0; i <=arr.length-1; i++) {     
                System.out.println(arr[i] + " "); 
            }
        }

    }
}
