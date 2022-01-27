package PracticeArray;

public class MissingNumber1 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,7,8,9,10};
		int sum1=0;
		int sum2=10*((10+1))/2;
		//int missing= sum2-sum1;
		System.out.println(sum2);
		
		for(int i=0;i<arr.length;i++)
		{
			sum1=arr[i]+sum1;
		}
		System.out.println(sum1);
		int missing= sum2-sum1;
		System.out.println("the missing number  is"+ missing);
	}


}
