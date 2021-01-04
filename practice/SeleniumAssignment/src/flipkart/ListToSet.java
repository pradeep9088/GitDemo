package flipkart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class ListToSet {
	
	@Test
	public void convert()
	{
		
		ArrayList<String> ls= new ArrayList<String>(Arrays.asList("Java","is","My","language"));
		System.out.println("The Array List is "+ls);
		Set<String> st= new HashSet<String>(ls);
		System.out.println("The set is  :"+st);
		
		Iterator<String> it=st.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
