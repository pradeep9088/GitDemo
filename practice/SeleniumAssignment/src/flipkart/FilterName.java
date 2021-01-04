package flipkart;

import java.util.stream.Stream;
import org.testng.annotations.Test;

public class FilterName {
	
	@Test
	public void filter_Name_From_List()
	{
		Stream.of("Bob","Ahmad","Ravi","Sunil","Prakash","Anand").filter(s->s.length()==5||s.length()>5).forEach(s->System.out.println(s));
		
	}

}
