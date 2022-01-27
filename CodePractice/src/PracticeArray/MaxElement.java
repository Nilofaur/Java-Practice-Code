package PracticeArray;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,5,7,22,61};
		int fmax=0;
		int smax=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			else if (smax<a[i])
			{
				smax=a[i];
			}
			
		}
		
		
		System.out.println(fmax);
		System.out.println(smax);
	}

}
