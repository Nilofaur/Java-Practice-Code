package StringPackage;

public class ReplaceGivenChar9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="vitamin";
		//replace i with e 
		char c='e';
		char []ch=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
	if(ch[i]=='i')
	{
		ch[i]='e';
	}
	
	System.out.println(ch[i]);
}


	}

}
