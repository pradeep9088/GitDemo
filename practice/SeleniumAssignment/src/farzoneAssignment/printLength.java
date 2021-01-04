package farzoneAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class printLength {
	
	//@Test
	public void printTheLength()
	{
		String str="Ajay is here"; //exp res=10
		System.out.println("Length of string is :"+str.length());
		System.out.println(str.indexOf('e')+1);
				
	}
	
	@Test
	public void printNameWithA()
	{
		ArrayList<String> ls= new ArrayList<String>(Arrays.asList("Arvind","Mohan","Raju","Aryan","Adam"));
		
		System.out.println("Using for loop");
		for(int i=0;i<ls.size();i++)
		{
			if(ls.get(i).startsWith("A"))
			{
				System.out.println(ls.get(i));
			}
		}
		
		System.out.println("Using lambda expression");
		System.out.println(ls.stream().filter(s->s.startsWith("A")).collect(Collectors.toList()));
	}
}
