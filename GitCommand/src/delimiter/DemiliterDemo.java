package delimiter;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemiliterDemo {
	WebDriver driver=null;
	//Ques-1
	//@Test
	public void useOfDelimiter()
	{
		String delim="Hi\\Hey\\Sona\\Ajay\\kannan";

		String[] res=delim.split("\\\\");

		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}

	//Quest-2
	//@Test
	public void filterString()
	{
		//Create an array list
		ArrayList<String> ls= new ArrayList<String>();
		ls.add("Himayin");
		ls.add("Helen");
		ls.add("Sona");
		ls.add("Ajay");
		ls.add("Kannan");

		//using loop
		for(int i=0;i<ls.size();i++)
		{
			if(ls.get(i).length()>4)
			{
				System.out.println(ls.get(i));
			}
		}

		System.out.println("Using lambada expression");
		System.out.println(ls.stream().filter(s->s.length()>4).collect(Collectors.toList()));
	}

	//@Test
	public void printAllLink()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Work\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

		List<WebElement> elemList=driver.findElements(By.tagName("a"));

		for(int i=0;i<elemList.size();i++)
		{

			System.out.println(elemList.get(i).getText());
		}
	}

	//@Test
	public void print_month_drop_down()
	{
		//Go To Facebook and click on create account  and print all the values in the month drop down
		System.setProperty("webdriver.chrome.driver", "F:\\Work\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();

		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		month.click();
		String monthName=month.getText();
		List<String> ls=Arrays.asList(monthName);
		System.out.println(ls);

	}

	//@Test
	public void remove_dup_and_sort_an_integer_array()
	{
		//Remove duplicate and sort an integer array
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(21);
		al.add(22);
		al.add(23);
		al.add(24);
		al.add(22);
		al.add(25);
		al.add(23);

		System.out.println("using lambda expression");
		System.out.println(al.stream().distinct().sorted().collect(Collectors.toList()));
		System.out.println();

		System.out.println("using Set Interface");
		Set<Integer> st= new HashSet<Integer>(al);
		Iterator<Integer> it=st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	//@Test 
	public void get_the_last_word_of_the_string()
	{


		String str="Hi//gin//himcdf//gunb//My NoteBook";

		String[] res=str.split("//");
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		System.out.println();
		System.out.println("getting notbook from list");
		for(int i=0;i<res.length;i++)
		{
			if(res[i].startsWith("My"))
			{
				System.out.println(res[i]);
			}
		}
	}

	//@Test
	public void search_Items_from_amazon() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Work\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions a= new Actions(driver);

		//login to amazon
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span[1]")).click();
		driver.findElement(By.cssSelector("#ap_email")).sendKeys("7504677316");
		driver.findElement(By.cssSelector("#continue")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#ap_password")).sendKeys("Sanjeev@2020");
		driver.findElement(By.cssSelector("#signInSubmit")).click();

		//serach an apple item
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(5000);
		int i=1;
		while(i<3)
		{
			driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
			i++;
		}
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		List<WebElement> ls=driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone 7 (32GB)')]"));
		ls.get(0).click();
	}

	@Test
	public void add_items_to_the_list() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Work\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions a= new Actions(driver);

		//login to amazon
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span[1]")).click();
		driver.findElement(By.cssSelector("#ap_email")).sendKeys("7504677316");
		driver.findElement(By.cssSelector("#continue")).click();
		driver.findElement(By.cssSelector("#ap_password")).sendKeys("Sanjeev@2020");
		driver.findElement(By.cssSelector("#signInSubmit")).click();
		//search an apple item
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Mobile");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\"Apple iPhone 7 (32GB) - Black\"]")).click();
		Thread.sleep(3000);
		Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.cssSelector("#attach-sidesheet-checkout-button")).click();
		driver.close();
	}
}