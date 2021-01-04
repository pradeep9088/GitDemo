package flipkart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ReverseString {

	@Test
	public void reverse_the_string()
	{
		String str="You are welcome!";
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		System.out.println(res);
		

	}
}
