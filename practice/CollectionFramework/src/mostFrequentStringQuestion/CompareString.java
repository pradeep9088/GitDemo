package mostFrequentStringQuestion;

import org.testng.annotations.Test;

public class CompareString {
	@Test
	public void compTwoString()
	{
		String str1="Java is my language";
		String str2="Java language";
		if(str1.length()==str2.length())
		{
			System.out.println("String are same");
		}
		else
		{
			System.out.println("String are not same");
		}
	}

}
