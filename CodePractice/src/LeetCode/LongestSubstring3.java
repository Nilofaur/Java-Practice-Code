package LeetCode;

public class LongestSubstring3 {

	 public static int lengthOfLongestSubstring(String s) {
		 
		 char[]a=s.toCharArray();
		
		 System.out.println(a);
	        for (int i=0;i<=a.length;i++)
	        {
	        	
	        	for (int j=i+1;j<=a.length-1;j++)
	        	{
	        		
	        		
	        		if (a[i]==a[j])
	        		{
	        			System.out.println(a[j]);
	        			
	        			a[j]=0;
	        			System.out.println(a[i]);
	        			
	        			
	       		}
	        	}
	        	
//	        	if(a[i]!=0)
//	        	{
//	        		System.out.println(a[i]);
//	        	}
	        }
	        
	        
			return 0;
	        	
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lengthOfLongestSubstring("apleae");
	}

}
