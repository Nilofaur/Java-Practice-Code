package LeetCode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses20 {
			  
	HashMap<Character, Character> mappings;


public ValidParantheses20()
{ 
    this.mappings = new HashMap<Character, Character>();
		    this.mappings = new HashMap<Character, Character>();
		    this.mappings.put(')', '(');
		    this.mappings.put('}', '{');
		    this.mappings.put(']', '[');
		  }
	


	public boolean isValid(String string) {
		// TODO Auto-generated method stub
		Stack stack= new Stack();
		
		for (int i=0;i<string.length();i++)
		{
			char c=string.charAt(i);
			
			if(this.mappings.containsKey(c))
			{
				char topElement= stack.empty() ? '#': (char) stack.pop();
				
				 if (topElement != this.mappings.get(c)) 
				 
				{
					return false;
				}
				
				
			}
			
			else
				
				stack.push(c);
			
		}
		return stack.isEmpty();
	
	}
	

	public static void main(String[] args) {

		ValidParantheses20 v = new ValidParantheses20();
		System.out.println(v.isValid("{"));
	
	}


}
