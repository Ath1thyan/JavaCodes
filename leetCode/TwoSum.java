package leetCode;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                   return new int[] {i, j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = obj.twoSum(nums, target);
        if (result != null) {
            for (int index : result) {
                System.out.print(index + " ");
            }
        } else {
            System.out.println("No two elements found with the given sum.");
        }
    }
}