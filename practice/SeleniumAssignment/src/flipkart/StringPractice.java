package flipkart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StringPractice {
	
	@Test
	public void practiceString()
	{
		String str="Pradeep";
		String str1="Kumar";
		System.out.println(str=str1);
		
	}
	
	//@Test
	public void wschool()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\work\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		List<WebElement> ls= driver.findElements(By.xpath("//div[@id='main']//a"));
		
		System.out.println(ls.get(1).getText());
		
	}
	
	//@Test
	public void printLastChar()
	{
		
		String name="Kumar Pradeep";
		
		for(int i=name.indexOf('d');i<name.length();i++)
		{
			System.out.print(name.charAt(i));
		}
		System.out.println();
	}
	
	@Test
	public void printDupString()
	{
		String st="Fresh Fish";
		char ch;
		for(int i=0;i<st.length();i++)
		{
			for(int j=i+1;j<=st.length()-1;j++)
			{
				if(st.charAt(i)==st.charAt(j)&&st!=null)
				{
					ch=st.charAt(i);
					System.out.println(ch);
				}
			}
		}
		
	}
}
