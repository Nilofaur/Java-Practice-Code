package String;

public class Remove_duplicate {

	
	public static String solution(String str)
	{
		char[] c = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(c[i]==c[j])
				{
					//System.out.println(c[i]);
					c[i]='.';
				}
			}
			System.out.println(c[i]);
		}
		
		
		return str;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solution("java");
		//expected o/p -> jv
		

	}

}
