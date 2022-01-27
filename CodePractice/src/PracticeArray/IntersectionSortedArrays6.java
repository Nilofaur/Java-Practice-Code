package PracticeArray;

public class IntersectionSortedArrays6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,34,20,12,8};
		int b[]= {4,34,9,10,16};
		int c[]= new int[4];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c[j]=a[i];
				}
				
			}
		}
		
		for(int x:c)
		{
			System.out.println(x);
		}
		
		
		

	}

}
