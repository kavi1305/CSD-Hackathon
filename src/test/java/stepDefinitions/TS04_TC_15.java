package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import pageObject.CabPage;


public class TS04_TC_15 {

	WebDriver driver=BaseClass.getDriver();
	 CabPage page=new CabPage(driver);
	
	@Then("check the distance coverd is displayed")
	public void check_that_distance_coverd_is_displayed() throws Exception 
	{
	
		BaseClass.getLogger().info("User check the Distance,after enter the Valid Details");
	
	   if(page.isCabDistDisplayed()) 
	   {
		   BaseClass.getLogger().info("User check the Distance,after enter the Valid Details : Passed");
		   Assert.assertTrue(true);
	   }
	   else
	   {
		   BaseClass.getLogger().info("User check the Distance,after enter the Valid Details : Failed");
		   Assert.fail();
	   }
	}

}
