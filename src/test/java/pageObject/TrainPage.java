package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrainPage extends BasePage{
	
	public TrainPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[5]/span/a")
	WebElement train_button;
	
	@FindBy(xpath="//*[@id=\"top-banner\"]/div[2]/div/div/div/div[1]/span[3]")
	WebElement train_live_status;
	
	@FindBy(xpath="//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/p/a")
	WebElement train_search_button;
	
	@FindBy(xpath="//*[@id='fromCity']")
	WebElement from_button;
	
	//From input
	@FindBy(xpath="//input[@placeholder='From']")
	WebElement from_input;
	
	//clicking TO city
	@FindBy(xpath="//*[@id='toCity']")
	WebElement to_button;
	
	//To input
	@FindBy(xpath="//input[@placeholder='To']")
	WebElement to_input;
	
	//First Suggestions city
	@FindBy(xpath="//*[@id=\"react-autowhatever-1-section-0-item-0\"]")
	WebElement suggestion_city;
	
	@FindBy(xpath="//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div/div[4]/label/div/p")
	WebElement class_train;
	
	@FindBy(xpath="//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div/div[4]/ul/li[4]")
	WebElement second_ac;
	
	// Search Button
	@FindBy(xpath="//a[text()='Search']")
	WebElement search_button;
	
	@FindBy(xpath="//*[@id='top-banner']/div[2]/div/div/div/div[1]/span[2]")
	WebElement pnr_status_live_button;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/label/div/div/input")
	WebElement pnr_text_box_button;
	
	@FindBy(xpath="//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/p/a")
	WebElement searchPNR;
	
	@FindBy(xpath="//input[@id='trainNum']")
	WebElement train_number_button;
	
	@FindBy(xpath="//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div/div/input")
	WebElement train_number;
	
	@FindBy(xpath="(//span[@class='sr_city blackText'][contains(text(),'MS-MDU')])[1]")
	WebElement train_selection;
	
	@FindBy(xpath="//*[@id=\"top-banner\"]/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div/h2")
	WebElement navigating_vaigaipage;
	
	@FindBy(xpath="//*[@id='top-banner']/div[2]/div/div[2]/div/div/div/p[2]")
	WebElement pnr_status;
	
	@FindBy(xpath="//*[@id=\"top-banner\"]/div[2]/div/div/div/div[2]/div/div[3]/label/span")
	WebElement train_start_date;
	
	@FindBy(xpath="//div[@class='minContainer']//div[@class='landingContainer']//li[3]")
	WebElement today_date;
	
	@FindBy(xpath="//a[normalize-space()='CHECK STATUS']")
	WebElement check_status_button;
	
	//method for train button
	public void trainButton() {
		train_button.click();
	}
	
	
	//method for search button
	public void trainSearchButton() {
		train_search_button.click();
	}
	//method for click the radio button of train live status
	public void trainLiveStatus() {
		train_live_status.click();
	}
	//method to check the train live status radio button is enabled
	public boolean isTrainLivstatEnabled() {
		boolean var=train_live_status.isEnabled();
		return var;
	}
			
	//method for clicking from city	
	public void fromButton()  {

		from_button.click();
	}
	
	//method for clicking to city
	public void toButton()  {
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].click()", to_button);
	
	}
	
	
	//method to send values to from city	
	public void fromCity(String fromcity) throws InterruptedException  {
			
		from_input.sendKeys(fromcity);
		Thread.sleep(5000);
		suggestion_city.click();
	}
	//method to send values to city		
	public void toCity(String tocity) throws InterruptedException  {
			
		to_input.sendKeys(tocity);
		Thread.sleep(3000);
		suggestion_city.click();
	}
	//method to select date
	public void date(String depDate) {

		WebElement date=driver.findElement(By.xpath("//*[contains(@class,'DayPicker-Day')][@tabindex=-1][@aria-disabled='false'][contains(@aria-label,'"+depDate+"')]"));
		date.click();
	}
	//method to select class type	
	public void classTrain() {

		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].click()",class_train );	
	}
	//method to select 2nd AC class	
	public void secondAC() {
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].click()",second_ac );
	}
	//method to get title	
	public boolean getTitle() {

		String title=driver.getTitle();
		if(title.equalsIgnoreCase("MakeMyTrip - Trains")) {
	
			return true;	
		}
			return false;
		}

	//method to click search button	
	public void searchButton() {
	
		search_button.click();
	}
	//method to click pnr radio button		
	public void pnrStatusButton() {

		pnr_status_live_button.click();		
	}
	//method to send the pnr number 	
	public void pnrTextBox(String pnr_number) {
	
		pnr_text_box_button.click();
		pnr_text_box_button.sendKeys(pnr_number);
	}
	//method to click the search pnr button 	
	public void searchPNRButton() {

		searchPNR.click();
	}
	//mehtod to get the pnr status	
	public String pnrStatus() {

		try {
			Thread.sleep(7000);
		} 
		catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		return pnr_status.getText();
		}
	//method to select the train
	public void train_number(String tnumber) throws InterruptedException {

		train_number_button.click();
		Thread.sleep(2000);
		train_number.sendKeys(tnumber);
		
		try {
			Thread.sleep(2000);
			}
		catch (InterruptedException e) {
				e.printStackTrace();
			}
		train_selection.click();		
		}
	
	@FindBy(xpath="//*[@id=\"top-banner\"]/div[2]/div/div[2]/div/p[3]/a[3]")
	WebElement train_number_message;
	//method to check the navigation
	public boolean isNavigating() {

		try {
		return navigating_vaigaipage.isDisplayed();		
		}
		catch(Exception e) {
			return train_number_message.isDisplayed();
			
		}
		
	}
	//method to select to today's date	
	public void train_date_today() {
		
		train_start_date.click();
		today_date.click();
	}
		
	//method to click the check status button	
	public void checkStatusButton() {
	
		check_status_button.click();
		
	}
}
