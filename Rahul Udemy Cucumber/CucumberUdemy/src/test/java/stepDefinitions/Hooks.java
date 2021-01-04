package stepDefinitions;

import cucumber.Automation.Base;
import io.cucumber.java.After;

public class Hooks extends Base{
	
	@After("@SmokeTest")
	public void closeBrowser()
	{
		driver.close();
	}

}
