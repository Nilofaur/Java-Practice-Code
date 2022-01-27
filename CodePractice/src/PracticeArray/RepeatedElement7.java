package PracticeArray;

public class RepeatedElement7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,1,2,2,3,4,4,5,5};
		int x = 0;
		for(int i=0;i<a.length;i+=2)
		{
			if(a[i]!=a[i+1])
			{
				 x=a[i];
				break;
			}
			
			
		}
		
	//	if(a[a.length-2]!= a[a.length-1])
		//	x=a[a.length-1];
		System.out.println(x);
	}

}


 