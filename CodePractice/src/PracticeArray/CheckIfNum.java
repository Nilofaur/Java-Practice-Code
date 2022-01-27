package PracticeArray;

public class CheckIfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int count=0;
	        
			
			String s="h2jh4kh3l";
			int num[]= {0,1,2,3,4,5,6,7,8,9};
			char a[]=s.toCharArray();
			
			for(int i=0;i<a.length;i++)
			{
				System.out.println("test"+a[i]);
			for(int j=0;i<num.length;j++)
			{
				
					if(a[i]==num[j])
						System.out.println("a[i]"+a[i]);
						count++;
						System.out.println("num[j]"+num[j]);
					
				}
				
					
				
			}
			System.out.println("count= "+count);

	}

}
