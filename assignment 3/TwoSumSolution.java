package assignment3;

public class TwoSumSolution {
    public static int[] twoSum(int[] nums, int sum) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == sum) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0]; 
    }

    public static void main(String[] args) {
        int[] nums = {0, 7, 11, 15, 9,3};
        int sum = 12;
        int[] result = twoSum(nums, sum);
        
        if (result.length > 0) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}
