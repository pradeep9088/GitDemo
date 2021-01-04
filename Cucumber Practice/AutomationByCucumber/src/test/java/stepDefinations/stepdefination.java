package stepDefinations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class stepdefination {
	WebDriver driver=null;
	@Given("^user is on landing page$")
	public void user_is_on_landing_page() 
	{
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://book.spicejet.com/");
	    driver.manage().window().maximize();
	}

	@When("^user select from city from dropdown$")
	public void user_select_from_city_from_dropdown() {
	    
	}

	@When("^user select To city from dropdown$")
	public void user_select_to_city_from_dropdown() {
	 
	}

	@When("^user select depart Date$")
	public void user_select_depart_date() {
	    
	}

	@When("^user select number of passenger$")
	public void user_select_number_of_passenger() {
	    
	}

	@When("^user select currency$")
	public void user_select_currency() {
	    
	}

	@Then("^User clicks on search button$")
	public void user_clicks_on_search_button() {
	    
	}

}
