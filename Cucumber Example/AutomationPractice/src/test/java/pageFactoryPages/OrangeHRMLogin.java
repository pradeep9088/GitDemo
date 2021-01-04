package pageFactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogin {
	
	@FindBy(id="txtUsername")
	WebElement txt_username;

	@FindBy(id="txtPassword")
	WebElement txt_password;
	
	@FindBy(id="btnLogin")
	WebElement Login_Btn;
	
	WebDriver driver;
	public OrangeHRMLogin(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, OrangeHRMLogin.class);
	}
	
	public void EnteruserName(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void EnterPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clickLoginBtn()
	{
		Login_Btn.click();
	}
}
