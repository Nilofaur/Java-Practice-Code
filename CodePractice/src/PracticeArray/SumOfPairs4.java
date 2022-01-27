package PracticeArray;

public class SumOfPairs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,4,2,6,0,3,5,7};
		int total=4;
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==4)
				{
					System.out.println("i m a[i]"+a[i]);
					System.out.println(+a[j]);
				}
			}
			
		}

	}

}
