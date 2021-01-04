package linkedHashSet;

import java.util.*;

import org.testng.annotations.Test;

public class LinkedHashSetExample {
	
	@Test
	public void duplicateRemoval()
	{
		//removing duplicate using hash set
		
		ArrayList<String> ls= new ArrayList<String>();
		ls.add("CHEN");
		ls.add("HYD");
		ls.add("MUM");
		ls.add("BAN");
		ls.add("CHEN");
		ls.add("MUM");
		
		System.out.println("Before sorting :"+ls);
		Set<String> st= new LinkedHashSet<String>(ls);
		System.out.println("After Sorting :"+st);
		
	}

}
