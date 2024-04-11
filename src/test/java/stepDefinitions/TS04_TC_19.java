package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.TrainPage;

public class TS04_TC_19 {

	WebDriver driver=BaseClass.getDriver();
	TrainPage tpage=new TrainPage(driver);

	@When("PNR status button should be clicked by user")
	public void pnr_status_button_should_be_clicked_by_user() {
		
		BaseClass.getLogger().info("User click the PNR Status Button in Train Page");
		tpage.pnrStatusButton();
		
	}

	@When("user enter the number {string}")
	public void user_enter_the_number(String number) {
		
		BaseClass.getLogger().info("User enter the PNR Number in the Text Box");
		tpage.pnrTextBox(number);
	}

	@When("user click the check status button")
	public void user_click_the_check_status_button() {
		
		BaseClass.getLogger().info("User search the PNR Status");

		tpage.searchPNRButton();
	}

	@Then("Navigate to next page and a message {string}  should be shown.")
	public void navigate_to_next_page_and_a_message_should_be_shown(String pnrstatus) {
		
		BaseClass.getLogger().info("User navigate to the pnr status page and get the message");

		String status=tpage.pnrStatus();
		
		BaseClass.getLogger().info("user validate the pnr status Message");

		Assert.assertEquals(status,pnrstatus );
	}
}
