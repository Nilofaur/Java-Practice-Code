package PracticeArray;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {4,6,10,8,5};
		for(int j=0;j<a.length+1;j++)
		{
		for(int i=0;i<a.length-i-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			
				}
		for(int i=0;i<a.length+1;i++)
			
		{
			System.out.println(a[i]);
		}		
		}
		
		
	}
}
