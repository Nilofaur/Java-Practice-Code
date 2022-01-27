package String;

public class max_occur_char {
	static int count =0;
	static char repeat;
	
	public static String solution(String str)
	{
		char[] s = str.toCharArray();

		
		for(int i=0;i<s.length;i++) {
			int count=0;
			char c=str.charAt(i);
			for(int j=0;j<s.length;j++)
			{
				if(c==s[j])
				{
					count ++;
					s[j]='\u0000';
				}
			}
if(count>0)
			System.out.println(c+"="+count);
		}
		
	
		
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "vjavatv";
		solution(s);

	}

}
