package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Homepage;

public class TS04_TC_04 {

	WebDriver driver=BaseClass.getDriver();
	Homepage page=new Homepage(driver);
	public String testValue;
	
	
	@When("user entered to {string}")
	public void When_user_entered_to(String string) throws Exception
	{
	    
		BaseClass.getLogger().info("User enter the To Value With Invalid data");
	    page.toButton();
	    testValue=page.searchToCity(string);  
	}
	
	@Then("check whether the entered detail is valid.")
	public void check_whether_the_entered_detail_is_valid() 
	{
	   if(testValue.equals("No Data Found")) 
	   {
			BaseClass.getLogger().info("User Check the Invalid To and Passed");

		   Assert.assertTrue(true);
	   }
	   else
	   {
			BaseClass.getLogger().info("User Check the Invalid To and Failed");

		   Assert.fail();
	   }
	}
}
