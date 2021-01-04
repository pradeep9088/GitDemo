package flipkart;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
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


public class AddListToCartTest {
	
	@Test
	public void loginToFlipkart() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//a.Login to flipkart application and validate you are able to login and your profiles information is shown
		List<WebElement> usepass=driver.findElements(By.xpath("//div[contains(@class,'_3wFoIb')]//input"));
		
		usepass.get(0).sendKeys("8617267760");
		usepass.get(1).sendKeys("Nov2020");
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l')][@type='submit']")).click();
		
		Actions a=new Actions(driver);
		WebElement movToAcc=driver.findElement(By.xpath("//div[text()=\"My Account\"]"));
		a.moveToElement(movToAcc).build().perform();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'My Profile')]")));
		driver.findElement(By.xpath("//div[contains(text(),'My Profile')]")).click();
		
		//b.Search for an item in the search box:Smart phone
		WebElement itemToBeSearch=driver.findElement(By.xpath("//input[contains(@title,'Search for products')]"));
		itemToBeSearch.sendKeys("smart phone");
		itemToBeSearch.sendKeys(Keys.ENTER);
		
		//c.Select a particular smart phone and navigate to the details (Validate you are able to navigate to details)
		WebDriverWait waitForDetails= new WebDriverWait(driver, 30);
		waitForDetails.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'_3pLy-c')]")));
		driver.findElement(By.xpath("//div[contains(@class,'_3pLy-c')]")).click();
		
		//Click on Add To Cart
		Thread.sleep(3000);
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String childId=it.next();
		String parentId=it.next();
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//button[text()=\"ADD TO CART\"]")).click();

	}

}
