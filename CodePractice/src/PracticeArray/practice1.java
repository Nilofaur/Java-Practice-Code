package PracticeArray;

public class practice1 {

	public static boolean isPrime(int number,int x) {
		
		boolean result= true;
		if(number==1)
		{
			result = false;
		}
		if(x==10)
		{
			result = true;
		}
		if(number>2)
		{
			for(int d=2; d<number;d++)
			{
				if(number%d==0)
				{
					result = false;
				}
			}
			result = false;
		}
		return result;
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(1,10));

	}

}
