package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class orangeHRM {
	WebDriver driver;
	By txt_username=By.id("txtUsername");
	By txt_password=By.id("txtPassword");
	By btn_Login=By.id("btnLogin");
	
	public orangeHRM(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void user_enter_username(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void user_enter_password(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void user_click_on_login_button()
	{
		driver.findElement(btn_Login).click();
	}

}
