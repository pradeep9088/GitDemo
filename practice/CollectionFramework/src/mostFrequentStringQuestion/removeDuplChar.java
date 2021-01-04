package mostFrequentStringQuestion;

import org.testng.annotations.Test;

public class removeDuplChar {

	@Test
	public void removDuplicateChar()
	{
		String s="Java";
		String s1=" ";
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(s1.indexOf(c)<0)
			{
				s1=s1+c;
			}
		}
		System.out.println(s1);
	}
}
