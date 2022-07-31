package stringProg;

import java.util.HashMap;

public class CountOfEachChar {
	
	public static void main(String[] args) {
		
	
	
	String input = "Avishkar Sorate";
	
	char [] c = input.toCharArray();
	
	HashMap <Character, Integer> a= new HashMap<>();
	
	for (int i =0; i<c.length; i++)
	  {
		if (a.containsKey(c[i]))
		{
			a.put(c[i], a.get(c[i])+1);
		}
		
		else 
		{
			a.put(c[i],1);
		}
	  }
	System.out.println(a);
	}
}
