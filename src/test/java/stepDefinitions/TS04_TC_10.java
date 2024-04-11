package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.TrainPage;

public class TS04_TC_10 {
	WebDriver driver=BaseClass.getDriver();
	TrainPage tpage=new TrainPage(driver);
	
	@When("user enter class as {string}")
	public void user_enter_class_as(String string) {
		tpage.classTrain();
		tpage.secondAC();
	}

	@Then("check the Navigating Page")
	public void check_the_navigating_page() {
		try {
			Assert.assertEquals(true,tpage.getTitle());
		}
		catch(Exception e) {
			Assert.fail();
		}
		
	}

}
