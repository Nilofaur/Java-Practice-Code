package LC;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray26 {
    public int[] removeDuplicates(int[] nums) {
        int k = nums.length;

        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (nums[i] == nums[j]) {
                    // Shift elements to the left to remove the duplicate
                    for (int m = j; m < k - 1; m++) {
                        nums[m] = nums[m + 1];
                    }
                    // Adjust the array length to reflect the removal
                    k--;
                    j--; // Adjust the index after the shift
                }
            }
        }

        // Create a new array with the unique elements
        int[] result = new int[k];
        System.arraycopy(nums, 0, result, 0, k);

        return result;
        
    }

    public static void main(String[] args) {
        int[] nums = {8,8,9,10,10,11};
                              
          

        RemoveDuplicatesSortedArray26 dup = new RemoveDuplicatesSortedArray26();
        int[] result = dup.removeDuplicates(nums);

        // Print the contents of the array using Arrays.toString()
        System.out.println(Arrays.toString(result));
        int ans = result.length;
        System.out.println(ans);
        
    }
}

