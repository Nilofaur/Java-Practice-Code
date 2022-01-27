package PracticeArray;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="nilofaur";
		char letter='a';
		int position = 0;
		int count=0;
		char a[]=s.toCharArray();
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==letter)
			{
				count=count+1;
				position=i;
			}
			
		}
		System.out.println(count);	
		System.out.println(position+1);
	}


}
