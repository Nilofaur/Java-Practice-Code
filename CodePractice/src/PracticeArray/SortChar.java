package PracticeArray;

public class SortChar {
 //1	
	
//2 
	static void converttoascii(char[] charr) 
	{  
		int[]y = new int[charr.length]; 
		for(int i=0;i<charr.length;i++)
		{
			
			y[i]=(int)charr[i];	
			
		}
		
		for(int j=0;j<charr.length;j++)
		{
			System.out.println("Im y(j)"+ y[j]);
			
		}
		bubbleSort(y);
		
		
	}
	
// sort the integer array
	

	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
         
         System.out.println("Array After Bubble Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  
       
         convert(arr);
         
        
  
    }  
	
	//convert integer array to char array
	public static void convert(int[] arr) {
		
	    int length = arr.length;
	    for (int i = 0; i < length; i++) {
	        
			// this converts a integer into a character
		    System.out.println("sorted char final"); 
	        System.out.println((char) arr[i]);
	    }
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		// 1. sending char array
		char []ch= {'b','e','a','d','c'};
		//char sorted;
		converttoascii(ch);
	        
		//2. Convert each to ascii
		//3.Store the ascii in an array
		//4. Sort the numbers
	
		//5. Convert back to char
		//6. Print the char
		
		
	}

}
