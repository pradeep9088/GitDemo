package StepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMpages.QaClickAcademy;
import driverSetUp.ProjectPathSetUp;
import io.cucumber.java.en.*;

public class QaClickValidation {
	
	WebDriver driver;
	QaClickAcademy aca;
	@Given("user is on QaClickAcademy login page")
	public void user_is_on_QaClickAcademy_login_page() {
		ProjectPathSetUp driv= new ProjectPathSetUp();
		driv.pathsetup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("http://qaclickacademy.com/");
		driver.manage().window().maximize();
	}
	
	@When("user click on Login link from tab")
	public void user_click_on_login_link_from_tab() {
		
		aca= new QaClickAcademy(driver);
		aca.userClickOnLogin(); 
	}

	@When("user enters (.) and (.$)")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
	    
		/*Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(parentId);*/
		Thread.sleep(4000);
		aca= new QaClickAcademy(driver);
		aca.userEnterEmailAddress(username);
		aca.userEnterPassword(password);
		
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		
		aca= new QaClickAcademy(driver);
		aca.userClickOnLoginBtn();  
	}

	@Then("user should be looged in successfully")
	public void user_should_be_looged_in_successfully() {
		
	System.out.println("Login succssful");
	    
	}

}
