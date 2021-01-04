package mostFrequentStringQuestion;

import org.testng.annotations.Test;

public class ReverseString {

	@Test
	public void reverseString()
	{
		String str="Java is a programming language";
		String res=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		System.out.println(res);

	}

}
