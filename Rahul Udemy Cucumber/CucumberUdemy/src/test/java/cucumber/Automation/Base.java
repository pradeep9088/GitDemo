package cucumber.Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties pro;
	public static WebDriver getDriver() throws IOException
	{
		pro=new Properties();
		String projectPath=System.getProperty("user.dir");
		FileInputStream fis= new FileInputStream(projectPath+"/src/test/java/cucumber/Automation/global.properties");
		pro.load(fis);
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(pro.getProperty("url"));
		return driver;
	}

}
