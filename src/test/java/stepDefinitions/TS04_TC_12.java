package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import pageObject.Homepage;

public class TS04_TC_12 {
	
	WebDriver driver=BaseClass.getDriver();
	Homepage page=new Homepage(driver);
	@Then("check the function of Departure date with invalid input {string}")
	public void check_the_function_of_departure_date_with_invalid_input(String string)
	{

	    try 
	    {
			BaseClass.getLogger().info("User check the Function of Depature Date with inValid Input");

			page.date(string);
			BaseClass.getLogger().info("User check the Function of Depature Date with inValid Input : Passed");

			Assert.fail();
	    }
	    catch(Exception e)
	    {
			BaseClass.getLogger().info("User check the Function of Depature Date with inValid Input : Failed");

	    	Assert.assertTrue(true);
	    }
	}

}
