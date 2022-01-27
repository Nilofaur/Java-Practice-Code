package PracticeArray;

public class ContainsNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0;
        
		char c = 0;
		String s="r2anj224af";
		for(int i=0;i<s.length();i++)
		{
			 c=s.charAt(i);
			System.out.println("charAt is used "+c);
			if(c=='2'||c=='4')
			{
				
				count++;
			
			}
			
			System.out.println("count= "+count);
		}
	
	//System.out.println(c);

}
}