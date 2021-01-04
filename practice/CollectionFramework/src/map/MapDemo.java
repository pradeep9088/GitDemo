package map;

import java.util.*;

import org.testng.annotations.Test;

public class MapDemo {
	
	@Test
	public void hashMap()
	{
		Map<Integer, String> mp= new HashMap<Integer, String>();
		mp.put(1, "Pradeep");
		mp.put(2, "RaviRanjan");
		mp.put(3, "Navnit");
		
		System.out.println();
		System.out.println("Key value pairs are :"+mp);
		
		System.out.println("The last string is :"+mp.get(3));
	}

}
