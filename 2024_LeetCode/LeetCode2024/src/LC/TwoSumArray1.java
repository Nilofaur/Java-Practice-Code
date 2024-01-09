package LC;

public class TwoSumArray1 {
    public int[] twoSum(int[] nums, int target) {
        int[] op = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    op[0] = i;
                    op[1] = j;
                    return op; 
                }
            }
        }

        throw new IllegalArgumentException("No TwoSumArray1 found");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSumArray1 s = new TwoSumArray1();
        int[] result = s.twoSum(nums, target);

        
    }
}
