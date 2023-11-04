package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Dup_num_remove2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Remove duplicates
        int[] result = removeDuplicates(arr);
        
        // Print the array without duplicates
        System.out.println("Array without duplicates: " + Arrays.toString(result));
        
        scanner.close();
    }
    
    public static int[] removeDuplicates(int[] arr) {
        int[] uniqueArray = new int[arr.length];
        int uniqueCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            
            // Check if the current element is already in the uniqueArray
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // If not a duplicate, add it to the uniqueArray
            if (!isDuplicate) {
                uniqueArray[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        
        // Create a new array with only the unique elements
        int[] result = Arrays.copyOf(uniqueArray, uniqueCount);
        return result;
    }
}
