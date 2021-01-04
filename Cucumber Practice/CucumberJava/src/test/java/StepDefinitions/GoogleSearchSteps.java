package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
	   
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://google.com");
		
	}

	@And("user is on google page")
	public void user_is_on_google_page() {
	   driver.manage().window().maximize();
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
	   
		WebElement inputText=driver.findElement(By.xpath("//*[@id='tsf']//div[2]//input[contains(@class,'gLFyf')]"));
		inputText.sendKeys("Amazon India");
	}

	@And("hits enter")
	public void hits_enter() {
	   
		driver.findElement(By.name("btnK")).click();
	}

	@Then("user is navigate to search results")
	public void user_is_navigate_to_search_results() {
		WebElement onPage=driver.findElement(By.xpath("//div[@id='tvcap']//span[contains(text(),'Amazon Great Indian Festival')]"));
		
	   if(onPage.isDisplayed())
	   {
		   System.out.println("The user is on :"+onPage.getText());
	   }
	   
	}

}
