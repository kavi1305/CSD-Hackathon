package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import pageObject.CabPage;

public class TS04_TC_08 {
	WebDriver driver=BaseClass.getDriver();
	 CabPage page=new CabPage(driver);
	 
		@Then("check that cab type filter is applied")
		public void check_that_cab_type_filter_is_applied() throws Exception 
		{
		
			BaseClass.getLogger().info("User Check the Car Filter is Enabled or Not");
		   if(page.isCabFilterApplied()) 
		   {
				BaseClass.getLogger().info("User Check the Car Filter is Enabled or Not :  Passed");

			   Assert.assertTrue(true);
		   }
		   else
		   {
				BaseClass.getLogger().info("User Check the Car Filter is Enabled or Not : Failed");

			   Assert.fail();
		   }
		}

}
