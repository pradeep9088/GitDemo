package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PFPages.HRMAdminPage;
import PFPages.OrangeHRMLogin;
import cucumber.Automation.Base;
import driverSetUp.AdminPage;
import driverSetUp.ProjectPathSetUp;
import io.cucumber.java.en.*;

public class OrangeHRMSteps {

	public WebDriver driver;
	OrangeHRMLogin opf;
	AdminPage ap;
	HRMAdminPage hap;
	public String expRes=null;
	@Given("user is on orange HRM application page")
	public void user_is_on_orange_hrm_application_page() throws IOException {

		driver=Base.getDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@When("^enter (.+) and (.+)$")
	public void enter_and(String username, String password) throws InterruptedException{
		opf= new OrangeHRMLogin(driver);
		Thread.sleep(3000);
		opf.user_enter_username(username);
		opf.user_enter_password(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		opf= new OrangeHRMLogin(driver);
		opf.user_click_on_login_Btn();
	}

	@Then("user should be logged in succesfully")
	public void user_should_be_logged_in_succesfully() {
		opf= new OrangeHRMLogin(driver);
		System.out.println("whether user is on Admin page :"+driver.getPageSource().contains("Admin"));
	}
	@When("user validate {string} tab")
	public void user_validate_tab(String tab) {
		ap=new AdminPage(driver);
		expRes=ap.getAdminHeader(tab).getText();
		System.out.println("The tab -"+tab+"is validated");
		Assert.assertTrue(tab.equalsIgnoreCase(expRes));
	}

}


