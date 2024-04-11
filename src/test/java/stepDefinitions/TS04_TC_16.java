package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import pageObject.CabPage;

public class TS04_TC_16 {
	
	WebDriver driver=BaseClass.getDriver();
	 CabPage page=new CabPage(driver);
	
	@Then("check that car model is enabled")
	public void check_that_car_model_is_enabled() throws Exception 
	{
	
		BaseClass.getLogger().info("User check the model,after enter the Valid Details");
	   if(page.isCabModelEnabled()) 
	   {
		   BaseClass.getLogger().info("User check the model,after enter the Valid Details : Passed");
		   Assert.assertTrue(true);
	   }
	   else
	   {
		   BaseClass.getLogger().info("User check the Distance,after enter the Valid Details : Failed");
		   Assert.fail();
	   }
	}

}
