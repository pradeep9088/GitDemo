package setDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class SetPractice {
	
	@Test
	public void setExample()
	{
		
		String[] st= {"KOL","HYD","MUM","CHEN","BAN","KOL","MUM"};
		
		Set<String> set= new HashSet<String>();
		for(int i=0;i<st.length;i++)
		{
			set.add(st[i]);
		}
		System.out.println("Unique String"+set);
		
		//Using TreeSet
		TreeSet<String> ts= new TreeSet<String>(set);
		System.out.println("The sorted String :"+ts);
		System.out.println("First String "+ts.first());
		System.out.println("The last String "+ts.last());
		
		//Using lambada Expression
		System.out.println("The Unique list from lambada expression "+
		Stream.of("KOL","HYD","MUM","CHEN","BAN","KOL","MUM").distinct().collect(Collectors.toList()));
		
		System.out.println("The Sorted list from lambada expression "+
		Stream.of("KOL","HYD","MUM","CHEN","BAN","KOL","MUM").distinct().sorted().collect(Collectors.toList()));
	}

}
