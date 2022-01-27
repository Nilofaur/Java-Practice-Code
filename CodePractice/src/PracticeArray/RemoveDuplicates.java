package PracticeArray;

public class RemoveDuplicates
{
	//sort method
	
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
  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // WORKING
		
		//find the duplicate 
		
		int number[]= {5,6,1,2,5,4};
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
		 System.out.println("this is the duplicate "+duplicate);
		
			
		 // sort method
		 
		 
		 bubbleSort(number);
		 
		 System.out.println("Array After Bubble Sort");  
         for(int i=0; i < number.length; i++){  
                 System.out.print(number[i] + " ");  
         }  
		 
		 // remove the duplicate	
		 
		 for(int i=0;i<number.length;i++)
			{
			 if(number[i]==duplicate)
				{
				 int pos=i;
				 for(int j=pos;j<number.length-1;j++)
					{
					number[j]=number[j+1];
					
					}
				}
			}
		 for(int x:number)
		 {
					System.out.println("number[i]"+x);
		 }
			
		 for(int i=0;i<number.length-1;i++)
			{
			 
			 System.out.println(number[i]);
}
	}
}