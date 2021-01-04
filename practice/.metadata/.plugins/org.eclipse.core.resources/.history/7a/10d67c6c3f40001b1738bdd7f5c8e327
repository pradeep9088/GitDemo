package mapEntry;

import java.util.*;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class MapEntryDemo {

	@Test
	public void MapEntry()
	{
		TreeMap<String, Double> hm= new TreeMap<>();

		hm.put("Sonu", new Double(437.5));
		hm.put("Raja", new Double(344.45));
		hm.put("Monu", new Double(430.453));
		hm.put("Vikky", new Double(324.45));
		hm.put("Shashi", new Double(200.45));

		Set st= hm.entrySet();
		Iterator it=st.iterator();

		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry) it.next();
			System.out.print(mp.getKey()+" :");
			System.out.println(mp.getValue());
		}

		//increase Sonu's marks
		double newMarks=((double) hm.get("Sonu"));
		hm.put("Sonu", (newMarks+40.5));
		System.out.println("Sonu new marks is :"+hm.get("Sonu"));

	}
}
