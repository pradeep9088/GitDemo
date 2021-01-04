package StepDefinitions;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class flipkartSteps {
	WebDriver driver=null;
	@When("^User launch Flipkart$")
	public void user_launch_flipkart() {

		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_pmaigra(String username,String password) {

		List<WebElement> ls=driver.findElements(By.xpath("//div[contains(@class,'_36HLxm')]//input"));
		ls.get(0).sendKeys(username);
		ls.get(1).sendKeys(password);   
	}

	@And("user logged in successfully")
	public void user_logged_in_successfully() {

		driver.findElement(By.xpath("//div[contains(@class,'_1D1L_j')]/button")).click();
	}

	@When("^user search items name in Flipkart$")
	public void user_search_items_in_flipkart() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@title,'Search for products, brands')]")).sendKeys("Peter England");
		driver.findElement(By.xpath("//input[contains(@title,'Search for products, brands')]")).sendKeys(Keys.ENTER);
	}

	@And("Print the price of the item")
	public void print_the_price_of_the_item() {

		List<WebElement> ls= driver.findElements(By.xpath("//div[contains(@class,'_2pi5LC')]//div[contains(@data-id,'F')]/div/a/following-sibling::div/a[contains(@class,'IRpwTa')]"));

		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i).getText());
		}
	}
	@Then("user adds searched item into kart")
	public void user_adds_searched_item_into_kart() throws InterruptedException {

		List<WebElement> ls= driver.findElements(By.xpath("//div[contains(@class,'_2pi5LC')]//div[contains(@data-id,'F')]"));
		
		ls.get(0).click();	
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//span[text()=\"View Details\"]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='swatch-2-size']")).click();
		driver.findElement(By.xpath("//button[text()=\"ADD TO CART\"]")).click();

	}
}
