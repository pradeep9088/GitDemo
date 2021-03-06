package interviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidateAscendingOrder {
	
	@Test
	public void validateTheList()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\work\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://register.rediff.com/commonreg/index.php?redr=http://portfolio.rediff.com/money/jsp/loginnew.jsp?redr=home");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("city")).click();
		
	
		String cityName=driver.findElement(By.id("city")).getText();
		System.out.println(cityName);
		
		String str=String.join(",", cityName);
		
		System.out.println(str);
	}
	
	//@Test
	public void reverseString()
	{ 
		
		String input ="This is test";
		System.out.println("The input string is- "+input);
		String[] str=input.split(" ");
		List<String> st= new ArrayList<String>();
		st=Arrays.asList(str);
		
		Collections.reverse(st);
		String output =  st.stream().map(String::valueOf).collect(Collectors.joining(" "));
		System.out.println("The reverse string is- "+output);
	}
}
