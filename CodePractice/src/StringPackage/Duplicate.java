package StringPackage;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="apple";
		String[] s1=new String[10];
		char []dupArr = null;
		
		//1. Print the duplicate 
		//convert to charArray
		
		  dupArr=s.toCharArray();
	
		System.out.println(dupArr);
		
	// compare with each element 
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(dupArr[i]==dupArr[j])
				{
					System.out.println("Duplicate       ="+dupArr[j]);
					
				}
			}
		}
		
		// FIND THE POSITION OF THE DUPLICATE TO BE DELETED 
		// 2. delete the duplicate 
		
		int pos=1;
		
		for (int i=pos;i<dupArr.length-1;i++)
		{

			dupArr[i]=dupArr[i+1];
								
		}
	
	dupArr[dupArr.length-1]=9999;
	
			
				//System.out.println(dupArr);
			
		
	for(char x:dupArr)
	{
		if(x!=9999)
		System.out.println("         "+x);
	}
		
		
		
	}

}
