package PFPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeHRMLogin {
	@FindBy(id="txtUsername")
	WebElement text_username;
	
	@FindBy(id="txtPassword")
	WebElement text_password;

	@FindBy(id="btnLogin")
	WebElement btn_Login;
	
	WebDriver driver;
	public orangeHRMLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void user_enter_username(String username)
	{
		text_username.sendKeys(username);
	}
	
	public void user_enter_password(String password)
	{
		text_password.sendKeys(password);
	}
	
	public void user_click_on_login_Btn()
	{
		btn_Login.click();
	}
}
