package listDemo;

import java.util.*;
import org.testng.annotations.Test;

public class ListPractice {
	
	@Test
	public void ListExample()
	{
		List<String> ls= new ArrayList<String>();
		ls.add("My");
		ls.add("Name");
		ls.add("is");
		ls.add("Pradeep");
		ls.add("Kumar");
		System.out.println(ls);
		
		//Linked List
		List<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(30);
		ll.add(30);
		System.out.println(ll);
		
		
	}
}
