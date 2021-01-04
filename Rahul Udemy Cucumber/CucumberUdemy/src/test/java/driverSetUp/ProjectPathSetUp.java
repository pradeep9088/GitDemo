package driverSetUp;

public class ProjectPathSetUp {
	public void pathsetup()
	{
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
	}
}
