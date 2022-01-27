package PracticeArray;

public class maxnum1 {

	public static void main(String[] args) {
		
		int a[]= {10,55,7,22,6};
		int temp=0;
	
		
	for(int j=0;j<a.length+1;j++) {
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		
		}
		//System.out.println(a[i]);
	}
	
	for(int i=0;i<a.length;i++) {
	
		System.out.println("temp"+a[i]);
	}
		//System.out.println(smax);

}
}