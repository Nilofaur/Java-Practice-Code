package LeetCode;

public class TwoSum1 {

	 public int[] twoSum(int[] nums, int target) {
	        
	        System.out.println("hi");
	         for (int i=0;i<nums.length;i++)
	         {
	             for(int j=i+1;j<nums.length;j++)
	             {
	                 if(nums[i]+nums[j]==target){
	                     return new int[] {i,j};
	             }
	         }
	        
	    }
	        return null;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
// how to call the above method
	}

}
