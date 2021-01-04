package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QaClickAcademy {
	
	WebDriver driver;
	private By tab_login_tab=By.xpath("//span[text()=\"Login\"]");
	private By txt_EmailAddress=By.id("user_email");
	private By txt_password=By.id("user_password");
	private By btn_LoginBtn=By.name("commit");
	
	public QaClickAcademy(WebDriver driver) {
		this.driver=driver;
	}
	
	public void userClickOnLogin()
	{
		driver.findElement(tab_login_tab).click();
	}
	
	public void userEnterEmailAddress(String username)
	{
		driver.findElement(txt_EmailAddress).sendKeys(username);
	}
	
	public void userEnterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void userClickOnLoginBtn()
	{
		driver.findElement(btn_LoginBtn).click();
	}

}
