package arrays;

public class NumOfEvenDig {
    public static void main(String[] args) {
        int[] arr ={1, 25, 325, 487, 4, 278, 4596};
        int d=0;
        for (int i=0; i<arr.length; i++){
            int c=0;
            while(arr[i]>0){
                c++;
                arr[i] = arr[i]/10;
            }
             if (c%2 == 0){
                    d+=1;
                }
                
        }
        System.out.println(d);
    }
}
