package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import baseClass.BaseClass;
import io.cucumber.java.en.*;
import pageObject.Homepage;

public class TS04_TC_03 {
	
	WebDriver driver=BaseClass.getDriver();
	Homepage page=new Homepage(driver);
	public String testValue1;
	
	@When("user entered from {string}")
	public void When_user_entered_from(String string) throws Exception
	{
	    
		BaseClass.getLogger().info("User enter the From Value With Invalid data");

	    page.fromButton();
	    testValue1=page.searchFromCity(string);  
	}
	
	@Then("check whether the entered detail is valid")
	public void check_whether_the_entered_detail_is_valid() 
	{
	   if(testValue1.equals("No Data Found")) 
	   {
			BaseClass.getLogger().info("User Check the Invalid From and Passed");

		   Assert.assertTrue(true);
	   }
	   else
	   {
		   BaseClass.getLogger().info("User Check the Invalid From and Failed");
		   Assert.fail();
	   }
	}

}
