package hashMapImplementation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class NumberOfChar {
	
	@Test
	public void find_number_of_character()
	{
		String string="FreshFish";
		
		HashMap<Character, Integer> hm= new HashMap<Character,Integer>();
		
		for(int i=0;i<string.length();i++)
		{
			Character c=string.charAt(i);
			if(hm.containsKey(c))
			{
				int count=hm.get(c);
				hm.put(c, count+1);
			}
			else 
			{
				hm.put(c, 1);
			}
		}
		System.out.println("Normal Loop -"+hm);
	
		System.out.println("Using compute method");
		HashMap<Character, Integer> hm1= new HashMap<Character,Integer>();
		String string1="FreshFish";
		for(int i=0;i<string1.length();i++)
		{
			Character c=string1.charAt(i);
			hm1.computeIfPresent(c, (ch,count)->count+1);
			hm1.computeIfAbsent(c, ch->1);
		}
		
		System.out.println(hm1);
		
		Set<Entry<Character,Integer>> st= hm1.entrySet();
		
		System.out.println("EntrySet is :"+st);
		
		Set<Character> key=hm1.keySet();
		System.out.println("KeySet :"+key);
		Collection<Integer> value=hm1.values();
		System.out.println("Values :"+value);
		
	}

}
