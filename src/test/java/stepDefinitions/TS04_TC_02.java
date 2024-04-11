package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import pageObject.CabPage;

public class TS04_TC_02 {

	
	WebDriver driver=BaseClass.getDriver();
	 CabPage page=new CabPage(driver);
	 
	@Then("check the radio button is enabled.")
	public void check_the_radio_button_is_enabled() 
	{
		BaseClass.getLogger().info("User check the Round Trip Button is Enabled or Not");

	    boolean val=page.isroundtripRButtonEnabled();
	   Assert.assertEquals(val, true);
	}
}
