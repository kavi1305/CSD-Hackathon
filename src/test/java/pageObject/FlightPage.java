package pageObject;

import org.openqa.selenium.WebDriver;



public class FlightPage extends BasePage{
	
	
	
	public FlightPage(WebDriver driver) {
		super(driver);
	
	}

	//Getting the title method
	public String getTitle1() 
	{
		String f_title=driver.getTitle();
		return f_title;
	}
}
