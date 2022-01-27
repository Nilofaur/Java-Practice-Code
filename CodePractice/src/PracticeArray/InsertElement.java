package PracticeArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class InsertElement {

	 // Method to add element at position
    private static void addElement(Integer[] arr, int element,int position)
    {
        // Coverting array to ArrayList
       List<Integer> list = new ArrayList<>(Arrays.asList(arr));

		//List<Integer> list=Arrays.asList(arr);
		
        // Adding the element at position
       //position(5th) -1 = at 4th length when i =0
       
        list.add(position- 1, element);
          
        // Converting the list back to array
        arr = list.toArray(arr);
  
       
        // Printing the updated array
        System.out.println("\nArray with " + element
                        + " inserted at position "
                        + position + ":\n"
                        + Arrays.toString(arr));
    }
      
    // Drivers Method
    public static void main(String[] args)
    {
        // Sample array
        Integer[] arr = { 1, 2, 3, 4, 5,
                        6, 7, 8, 9, 10 };
      
        // Printing the original array
        System.out.println("Initial Array:\n"
                        + Arrays.toString(arr));
  
        // Element to be inserted
        int element = 50;
      
        // Position to insert
        int position = 5;
      
        // Calling the function to insert
        addElement(arr, element, position);
    }
}