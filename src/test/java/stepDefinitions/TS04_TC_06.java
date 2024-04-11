package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HotelBookingPage;

public class TS04_TC_06 {
	
	WebDriver driver=BaseClass.getDriver();
	HotelBookingPage page;
	
	@When("user click the Hotel icon")
	public void user_click_the_hotel_icon() {
		
		
		page=new HotelBookingPage(driver);
		page.hotelButton();
		
	}

	@When("user enter city, property name or location value {string}")
	public void user_enter_city_property_name_or_location_value(String areaname) throws InterruptedException {
		BaseClass.getLogger().info("User click the location button");
		page.locationButton();
		
		BaseClass.getLogger().info("User enter the location name");
		page.locationName(areaname);
		BaseClass.getLogger().info("User click the Suggestion location");
		page.suggestionLocation();
	}

	@When("user select a valid date from CHECK-IN \\(value={string})")
	public void user_select_a_valid_date_from_check_in_value(String check_in) {
		BaseClass.getLogger().info("User click the checkIn button");
		page.checkInButton();
		BaseClass.getLogger().info("User enter the check In Date");
		page.checkInDate(check_in);
	}

	@When("user select a CHECK-OUT \\(value={string}) calendar.")
	public void user_select_a_check_out_value_calendar(String check_out) {
		
		BaseClass.getLogger().info("User click the checkout button");

		page.checkOutButton();
		BaseClass.getLogger().info("User enter the check out Date");
		page.checkOutDate(check_out);
	}
	
	
	@Then("user check for the values in Adult \\(Value={string}) list box.")
	public void user_check_for_the_values_in_adults_value_list_box(String count) {
		//page.roomGuest();
		
		BaseClass.getLogger().info("User click the adult button");
		page.adultButton();
		
		BaseClass.getLogger().info("User click the How many adults");
		page.adultList(Integer.parseInt(count));
		BaseClass.getLogger().info("User click the apply button");
		page.applyButton();
	}
	
    @Then("user click the search button")
	public void user_click_the_search_button() {
    	
    	BaseClass.getLogger().info("User click the search button");
		page.searchButton();
	}
	@Then("user check the filter button")
	public void user_check_the_filer_button() {
		
		BaseClass.getLogger().info("User click the Filter button");
		page.selectFilter();
		boolean tf=page.isFilterApplied();
		try {
			BaseClass.getLogger().info("User check the Filter is Enabled : Passed");
			Assert.assertEquals(true, tf);
		}
		catch(Exception e) {
			BaseClass.getLogger().info("User check the Filter is Enabled : Failed");
			Assert.fail();
		}
	}

}
