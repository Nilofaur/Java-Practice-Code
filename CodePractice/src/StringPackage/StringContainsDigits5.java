package StringPackage;

public class StringContainsDigits5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="nilo1";


		char c;
		char[] ch=s.toCharArray();
		/*
		 * for(int j=0;j<ch.length;j++) { for(int i=0;i<ch.length;i++) { if
		 * (ch.equals(0)) count++; { System.out.println("it contains a digit  " +
		 * ch[i]); }
		 * 
		 * System.out.println("count= " +count); }0
		 * 
		 * 
		 * }
		 */
		int pos = 0;
for(int k=0;k<s.length();k++)
{
	c=s.charAt(k);
	
	System.out.println("c= "   +c);
	
	for(int j=0;j<ch.length;j++)
	{
		if(ch[j]=='0'|| ch[j]=='1')
		{
			pos=j;
			
		}
		
	}
}
System.out.println("The number found  "+ch[pos]);
System.out.println(pos);    
		

	}

}
