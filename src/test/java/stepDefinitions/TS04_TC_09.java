package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.TrainPage;

public class TS04_TC_09 {

	WebDriver driver=BaseClass.getDriver();
	TrainPage tpage=new TrainPage(driver);
	
	@When("user click the train icon")
	public void user_click_the_train_icon() {
		
		BaseClass.getLogger().info("User click The Train Button In Home Page");

		tpage.trainButton();
		
	}

	@When("user select the Live Train Status")
	public void user_select_the_live_train_status() {
		
		BaseClass.getLogger().info("User select the train live status");

		tpage.trainLiveStatus();
	}

	@Then("user check the Live Train Status is enabled or not")
	public void user_check_the_live_train_status_is_enabled_or_not() {
		try {
			
			BaseClass.getLogger().info("User check the train live status is Enabled or Not");

		boolean tf=tpage.isTrainLivstatEnabled();
		
		BaseClass.getLogger().info("User check the train live status is Enabled or Not : Passed");

		Assert.assertEquals(true, tf);
		}
		catch(Exception e) {
			
			BaseClass.getLogger().info("User check the train live status is Enabled or Not : Failed");

			Assert.fail();
		}
	}
}
