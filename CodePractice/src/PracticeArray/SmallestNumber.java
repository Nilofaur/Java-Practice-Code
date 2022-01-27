package PracticeArray;

import java.util.Arrays;

public class SmallestNumber {
// not correct logic but got the output
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[]= {2,1,6,4,8,56};
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
		String s=Arrays.toString(number);
		System.out.println("s"+s);
		for (int i=0;i<s.length();i++)
		 {
		char ch=s.charAt(i);
		System.out.println("ch"+ch);
	
        }
		for (int i=0;i<5;i++)
		 {
			
			System.out.println("smallest"+s.charAt(i));
		 }
		
		 }
		
		 
		}
	

