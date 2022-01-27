package LeetCode;

public class PalindromeNumber9 {
	
	
		
	
		
	    public static boolean isPalindrome(int x) {
	    	int rem=0;
	    	int num=x;
	    	int rev = 0;
	    	while(x>0)
	    	{
	    		rem=x%10;	    		
	    		rev=rev*10+rem;
	    		x=x/10;
	          }
	    	
	    	if(rev==num)
	    	{
	    		System.out.println("pal");
	    		return true;
	    	}
	    	else
	    		System.out.println("FAIL");
			
			return false;
	        
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
System.out.println(isPalindrome(121));
	}

	
}
