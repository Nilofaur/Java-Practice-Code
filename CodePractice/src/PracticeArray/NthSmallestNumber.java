package PracticeArray;

import java.util.Arrays;

public class NthSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// sorted array
		
		int a[]= {4,2,3,5,1,6};
		Arrays.sort(a);
		for(int x:a) 
		{
			System.out.println(x);
		}
		
		//nth smallest array , n= 3rd
		int n=3;		
		for(int i=n-1;i<n;i++)
		{
			System.out.println("The 3rd smallest number"+a[i]);
		}
		
	//***************************************************************************//
		
		//Unsorted Array
		
		int b[]= {8,2,4,1,9,6};
		
		int n2=3;

		//sorting
		
		for(int i=0; i < b.length; i++){  
            for(int j=1; j < (b.length-i); j++)
            {  
                     if(b[j-1] > b[j])
                     {  
                            //swap elements  
                            int temp = b[j-1];  
                            b[j-1] = b[j];  
                            b[j] = temp;  
                     }  
                     
            }  
    }  
		 System.out.print( "Sorted "); 
		 for(int i=0; i < b.length; i++){  
		      
             System.out.print(b[i]);  
     }  
		
		 //nth smallest , n2=3;
		 
		 
		 for(int i=n2-1;i<n2;i++)
			{
				System.out.println("The 3rd smallest number"+b[i]);
			}
		
		
		}
		
		
		}

	


