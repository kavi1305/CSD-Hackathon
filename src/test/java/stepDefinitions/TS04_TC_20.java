package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.TrainPage;

public class TS04_TC_20 {

	WebDriver driver=BaseClass.getDriver();
	TrainPage tpage=new TrainPage(driver);

	
	@When("user enter the train number {string}")
	public void user_enter_the_train_number(String trainNumber) throws InterruptedException {
		
		BaseClass.getLogger().info("User Enter the Train Number");

		tpage.train_number(trainNumber);
		
	}

	@When("user click the today option")
	public void user_click_the_today_option() {
		
		BaseClass.getLogger().info("User click the Today in train selection");

		tpage.train_date_today();
		
	}

	@Then("Navigated to next page  and live train status of vaigai express is displayed.")
	public void navigated_to_next_page_and_live_train_status_of_vaigai_express_is_displayed() {
		
		BaseClass.getLogger().info("User click the check status Button");

		tpage.checkStatusButton();
		try {
			Thread.sleep(3000);
			
			BaseClass.getLogger().info("User navigate to the vaigai express page : passed");

			Assert.assertEquals(true, tpage.isNavigating());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			BaseClass.getLogger().info("User navigate to the vaigai express page : Failed");

			e.printStackTrace();
		}
		
		
	}
}
