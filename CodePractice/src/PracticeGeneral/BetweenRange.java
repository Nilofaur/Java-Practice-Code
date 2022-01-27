package PracticeGeneral;

public class BetweenRange {
	
	
	static boolean between(int x,int min,int max) 
	{
		  return x >= min && x <= max;
		}
		// ...
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		if (between(11, 1, 10)) {
			 System.out.println("yes its in the range");
			}

	}

}
