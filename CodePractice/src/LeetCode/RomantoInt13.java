package LeetCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RomantoInt13 {
	
	

static Map<String, Object> values = new HashMap<>();
    // Map values= new HashMap();
    static {
    	
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }
	
	 public static int romanToInt(String s) {
		
		 int res=0;
	for(int i=0;i<s.length();i++)
		
	{
		;
		int s1=(int) values.get(Character.toString((s.charAt(i))));
		
	
		if(i+1<s.length())
		{
			int s2 = 10;
		  s2=(int) values.get(Character.toString((s.charAt(i+1))));
		
		
		if(s1>=s2)
		{
			res=res+s1;
			
		}
		else
		{
			res=res+s2-s1;
			i ++;
		}
		}
		else {
			res=res+s1;
		}
		
	}
		
	return res;		
		
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           System.out.println(romanToInt("XC"));
           
	}

}
