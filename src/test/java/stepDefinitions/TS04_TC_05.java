package stepDefinitions;

import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.When;
import pageObject.CabPage;

public class TS04_TC_05 {
	
	
	WebDriver driver=BaseClass.getDriver();
	 CabPage page=new CabPage(driver);
	 
	@When("user click the Outstation Round-Trip")
	public void user_click_the_outstation_round_trip() 
	{
	    
		BaseClass.getLogger().info("User click the Round Trip Button");
	    page.roundtripRButton();
	}

}
