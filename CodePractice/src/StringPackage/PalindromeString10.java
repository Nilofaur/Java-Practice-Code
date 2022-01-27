package StringPackage;

public class PalindromeString10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="madamoo";
		char [] ch=s.toCharArray();
        char [] rev = new char[10];
		//reverse it  and compare
		
		for(int i=ch.length-1;i>=0;i--)
		{
			rev[i]=ch[i];
			
			System.out.println(rev[i]);
			
			}
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				
			if(rev[i]==(ch[j]))
			{

				System.out.println("Palindrome");
			}
		}
		
		}
		System.out.println("*********");
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}

}
