package PracticeArray;

import java.util.Arrays;

public class CountVowels {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int count=0;
		 int consonants=0;
		
		String s="abcde";
		
	 for (int i=0;i<s.length();i++)
	 {
		char ch=s.charAt(i);
		if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
		{
            count ++;
		 
	 }
		
		else
			consonants ++;
			
			
		
		 
}
	 System.out.println(count);
	 System.out.println(consonants);
	 
}}