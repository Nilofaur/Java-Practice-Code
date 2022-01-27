package PracticeGeneral;

public class bmr {

	
private static double BMR(double d,double e, int age) {
		
		double bmr = (10*e)+(6.25*d)-(5*age)-161;
	
		System.out.println("BMR"+bmr);
		return bmr;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  BMR(172.72, 59.87, 25);

	}

}
