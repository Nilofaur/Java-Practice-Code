package LeetCode;

public class LongestCommonPrefix14 {

	
	public static String longestCommonPrefix(String[] strs) 
	{
	    if (strs == null || strs.length == 0) 
	    	return "";
	    
	    for (int i = 0; i < strs.length ; i++)
	    {
	        char c = strs[0].charAt(i);
	        for (int j = 1; j < strs.length; j ++) 
	        {
	            if (i == strs[j].length() || strs[j].charAt(i) != c)
	                return strs[0].substring(0, i);             
	        }
	    }
	    return strs[0];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs= {"flower", "flight", "flow"};
		
		System.out.println(longestCommonPrefix(strs));
		
	}

}
