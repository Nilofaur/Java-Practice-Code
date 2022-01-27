package PracticeArray;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[]= {5,4,3,2,1};
		int position;  // element = 4 to be removed
		int element = 3;
		
		for(int j=0;j<x.length;j++)
				
		 {
			if(x[j]==element)
			{
				position=j;
			
		
		
		for(int i=position;i<x.length-1;i++)
		{
		
				x[i]=x[i+1];
				
		}
			}
		 }
		x[x.length-1]=9999;
		for(int a:x)
		{
			if(a!=9999)
		
			System.out.println(a);
	
		}
	
	
	}
		
			
	}
