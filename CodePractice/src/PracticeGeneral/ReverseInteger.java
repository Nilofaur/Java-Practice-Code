package PracticeGeneral;

public class ReverseInteger {
	//int rev=0;
	static void reversenumber (int num)
	{
		int rev=0;
		while (num !=0)
	{
			
		int mod= num % 10;
		 rev= rev*10+mod;
		num= num/10;
		
	}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		reversenumber(1234);
	}

}
