package LeetCode;

public class LongestPalindrome5 {

	
	public static String longestPalindrome(String s) {
		
		
        StringBuffer sb = new StringBuffer(); 
        sb.append(s);
        sb = sb.reverse();
		char []s_arr = s.toCharArray();
		String ssb=sb.toString();
		char []sb_arr = ssb.toCharArray();
		
		System.out.println(sb);
		System.out.println(s);
		
		for(int i=0;i<s.length();i++)
		{
			if(s_arr[i]==sb_arr[i])
				{
					System.out.print(sb_arr[i]);
					
				}
					
			
		}
		
		
	
		return s;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "caba";
		longestPalindrome(s);

	}

}
