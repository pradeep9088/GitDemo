package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactoryPages.OrangeHRMLogin;

public class OrangeHRMSteps {
	
	WebDriver driver=null;
	OrangeHRMLogin ob;
	@Given("^user is on orange HRM application page$")
	public void user_is_on_orange_hrm_application_page() throws Throwable {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@When("^enter (.+) and (.+)$")
	public void enter_and(String username, String password) throws InterruptedException{
		Thread.sleep(3000);
		ob=new OrangeHRMLogin(driver);
		ob.EnteruserName(username);
		ob.EnterPassword(password);

	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		ob=new OrangeHRMLogin(driver);
		ob.clickLoginBtn();

	}

	@Then("^user should be logged in succesfully$")
	public void user_should_be_logged_in_succesfully() throws Throwable {
		
		System.out.println(driver.getPageSource().contains("Admin"));

	}

}