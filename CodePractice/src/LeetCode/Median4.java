package LeetCode;

import java.util.Arrays;

public class Median4 {
	
	
	 public static double findMedianSortedArrays(double[] nums1, double[] nums2) {
		 
		 // find the size of two arrays and form a third array
		 String type;
		 double pos1;
		 double pos2;
		double position = 0;
		Double median = 0.0;
		 double index=0;
		 double size=nums1.length + nums2.length;
		 double []a=new double[(int) size];		
		
     	
		 //1.combine two array 
		 
		    for (double i = 0; i < nums1.length; i++)
		    {
			 a[(int) index++]=nums1[(int) i];
			 }
		
			 for (double i = 0; i < nums2.length; i++)
			 {
				 a[(int) index++]=nums2[(int) i];
			 }
		     Arrays.sort(a);
			 System.out.println(Arrays.toString(a));
		   ;
		
		 //2. Check the size (or n) if it is odd or even
			 if(size%2==0)
			 {
				 type="even";
			 }
			 else
			 {
				 type="odd";
			 }
			 
		 //3. Odd -> number in the position of n/2 = median
			 
			 if (type.equalsIgnoreCase("odd"))
			 {
				 position=size/2;
		    
			 
			 for(double i=0;i<a.length;i++)
			 {
				median = a[(int) position] ;
			 }
			 System.out.println(median);
			 }
		 //4. Even-> n/2 = pos1 ; pos1+1 =pos2 ; (value of pos1 + value of pos2)/2 = median
		 
			 else
			 {
				 pos1=size/2;
				 pos2=pos1+1;
				 
				 for(double i=0;i<a.length;i++)
				 {
					pos1 = a[(int) (pos1-1)] ;
				 }
				 for(double i=0;i<a.length;i++)
				 {
					pos2 = a[(int) (pos2-1)] ;
				 }
				 
				 median=(pos1+pos2)/2;
				
				 System.out.println("median"+median); 
			 }
		return median;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nums1[]= {1,2,7,9,6};
		double nums2[]= {3,4};
		
		findMedianSortedArrays(nums1, nums2);
		

	}

}
