package StringPackage;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="nilo";
		char ch[]=s.toCharArray();
		int a[]= {10,20,30,40,50,60,70,80,90};
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		// printing the string array in reverse order
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
			
		}
		
	}

}
