package hashMapImplementation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class IteratorOfHashMap {
	
	@Test
	public void iterationOfHashMap()
	{
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "Pradeep");
		hm.put(2, "Raviranjan");
		hm.put(3, "Navnit");
		hm.put(4, "Sanjeev");
		hm.put(5, "Sankalp");
		System.out.println("Using hashMap with foreach and lambada expression :");
		hm.forEach((roll,name)->System.out.println(roll+" --> "+name));
		
		System.out.println("Iterating Using hashMap with KeySet and for loop :");
		for(Integer std:hm.keySet())
		{
			System.out.println(std+" --> "+hm.get(std));
		}

		System.out.println("Iterating over HashMap's keyset() with foreach and lambda:");
		hm.keySet().forEach(user->System.out.println(user+" --> "+hm.get(user)));
		
		System.out.println("Iterating over HashMap's entrySet with iterator:");
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer, String> st=it.next();
			System.out.println(st.getKey()+" --> "+st.getValue());
		}
		
		System.out.println("Iterating over HashMap's entrySet with foreach and lambda:");
		hm.entrySet().forEach((entry)->System.out.println(entry.getKey()+" --> "+entry.getValue()));
		
		System.out.println("Iterating over HashMap's entrySet with foreach loop");
		for(Map.Entry<Integer,String> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" --> "+entry.getValue());
		}
	}

}
