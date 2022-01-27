package array_nos;

import java.util.ArrayList;

public class InsertNumber {

	public static void main(String[] args) {
		
		int a[]= {14,32,3,15,1,60};
		// insert '12' in 3rd position - 14,32,12,3,15,1,60.
		
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	al.add(14);
	al.add(32);
	al.add(3);
    al.add(15);
    al.add(1);
    al.add(60);
    
    al.add(2, 12);
    
   
    	System.out.println(al);
   
	

	}

}
