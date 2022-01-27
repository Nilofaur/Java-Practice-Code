package PracticeArray;

public class DuplicateNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// find one duplicate
		
		int number[]= {2,1,5,4,8,6,5,9};
		int duplicate=0;
		
		for(int i=0;i<number.length;i++)
		{
			for(int j=i+1;j<number.length;j++)
			{
				if(number[j]==number[i])
				{
					duplicate=number[j];
				}
			}
		}
		 System.out.println(duplicate);
		
		 
		 

	}

}
