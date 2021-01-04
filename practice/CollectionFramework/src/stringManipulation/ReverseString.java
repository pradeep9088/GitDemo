package stringManipulation;

import java.util.*;
import org.testng.annotations.Test;

public class ReverseString {
	
	//@Test
	public void reverStringFromList()
	{
		//Reverse the String
		ArrayList<Integer> ls= new ArrayList<Integer>();
		ls.add(10);
		ls.add(15);
		ls.add(20);
		ls.add(25);
		ls.add(30);
		
		Iterator<Integer> it= ls.iterator();
		System.out.println("Before revresing :");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Iterator<Integer> itn=ls.iterator();
		Collections.reverse(ls);
		System.out.println("After reversing number :");
		while(itn.hasNext())
		{
			System.out.println(itn.next());
		}
	}

	@Test
	public void sortingList()
	{
		//sort the numbers
		//Reverse the String
		ArrayList<Integer> ls= new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(15);
		ls.add(30);
		ls.add(25);
		
		System.out.println("Before Sorting :");
		Iterator<Integer> it= ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("After sorting :");
		Collections.sort(ls);
		Iterator<Integer> itn=ls.iterator();
		while(itn.hasNext())
		{
			System.out.println(itn.next());
		}
	}
}
