package PracticeArray;

public class DeleteElement4A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//my pgm -> duplicates found wrong pgm 
		int a[]= {4,6,10,8,5};
		int pos=3; // element 10 to be deleted
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=pos-1;j<a.length-1;j++)
			{
				if(a[j]!=0)
						{
					a[j]=a[pos];
						}
				
			}
			
			
			
			
			System.out.println(a[i]);
		}

		// notebook program -> correct
		// Deleting 10
		
		int b[]= {4,6,10,8,5}; 
		int pos1=1;
		for(int i=pos1;i<b.length-1;i++)
		{
			b[i]=b[i+1];
		}
		b[b.length-1]=9999;
		for(int x:b)
		{
			if(x!=9999)
			System.out.println("         "+x);
		}
		
		
	}

}
