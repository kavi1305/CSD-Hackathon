package stepDefinitions;

import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pageObject.BirthdayGiftCardPage;
import pageObject.GiftPage;
import pageObject.Homepage;
import utilities.DataReader;

public class TS05_TC_01 
{
	WebDriver driver=BaseClass.getDriver();
	Homepage page=new Homepage(driver);
	GiftPage giftpage=new GiftPage(driver);
	BirthdayGiftCardPage birthdaypage=new 	BirthdayGiftCardPage(driver);
	List<HashMap<String, String>> datamap;
	
	@Then("user entered driven test on from {string}")
	public void user_entered_driven_test_on_from(String rows) throws Exception 
	{
		BaseClass.getLogger().info("User Getting the Input from the Excel File");
		datamap=DataReader.data(System.getProperty("user.dir")+"\\TestData\\ExcelData1.xlsx", "Sheet1");

       int index=Integer.parseInt(rows)-1;
       String from= datamap.get(index).get("from");
       page.fromButton();
	   String testValue1=page.searchFromCity(from);
	   if(testValue1.equals("No Data Found")) 
	   {
		   String exp=datamap.get(index).get("exp_Result");
		   if(exp.equalsIgnoreCase("invalid")) 
		   {
			   Assert.assertTrue(true);
		   }
		   else 
		   {
			   Assert.fail();
		   }
		   
	   }
	   else
	   {
		   Assert.assertTrue(true);
	   }
	}
	@Given("enter the required details1 {string}")
	public void enter_the_required_details(String rows) throws Exception 
	{
	   datamap=DataReader.data(System.getProperty("user.dir")+"\\TestData\\ExcelData1.xlsx", "recipient_Name");

       int index=Integer.parseInt(rows)-1;
       String rname= datamap.get(index).get("RECIPIENT NAME");
       String rmobile= datamap.get(index).get("RECIPIENT NO");
       String rmail= datamap.get(index).get("RECIPIENT MAIL");
       String sname= datamap.get(index).get("SENDER NAME");
       String smobile= datamap.get(index).get("SENDER NO");
       String smail= datamap.get(index).get("SENDER MAIL");
       
       
       birthdaypage.recipientsName(rname);
       birthdaypage.senderName(sname);
       birthdaypage.senderNumber(smobile);
       birthdaypage.recipientsNumber(rmobile);
       birthdaypage.senderMail(smail);
       birthdaypage.recipientsMail(rmail);
       birthdaypage.buyNow();	
	}
	
	@Given("enter the required details2 {string}")
	public void enter_the_required_details2(String rows) throws Exception 
	{
	   datamap=DataReader.data(System.getProperty("user.dir")+"\\TestData\\ExcelData1.xlsx", "sender_no");

       int index=Integer.parseInt(rows)-1;
       String rname= datamap.get(index).get("RECIPIENT NAME");
       String rmobile= datamap.get(index).get("RECIPIENT NO");
       String rmail= datamap.get(index).get("RECIPIENT MAIL");
       String sname= datamap.get(index).get("SENDER NAME");
       String smobile= datamap.get(index).get("SENDER NO");
       String smail= datamap.get(index).get("SENDER MAIL");
       
       
       birthdaypage.recipientsName(rname);
       birthdaypage.senderName(sname);
       birthdaypage.senderNumber(smobile);
       birthdaypage.recipientsNumber(rmobile);
       birthdaypage.senderMail(smail);
       birthdaypage.recipientsMail(rmail);
       birthdaypage.buyNow();	
	}
	@Given("enter the required details3 {string}")
	public void enter_the_required_details3(String rows) throws Exception 
	{
	   datamap=DataReader.data(System.getProperty("user.dir")+"\\TestData\\ExcelData1.xlsx", "recipient_Email");

       int index=Integer.parseInt(rows)-1;
       String rname= datamap.get(index).get("RECIPIENT NAME");
       String rmobile= datamap.get(index).get("RECIPIENT NO");
       String rmail= datamap.get(index).get("RECIPIENT MAIL");
       String sname= datamap.get(index).get("SENDER NAME");
       String smobile= datamap.get(index).get("SENDER NO");
       String smail= datamap.get(index).get("SENDER MAIL");
       
       
       birthdaypage.recipientsName(rname);
       birthdaypage.senderName(sname);
       birthdaypage.senderNumber(smobile);
       birthdaypage.recipientsNumber(rmobile);
       birthdaypage.senderMail(smail);
       birthdaypage.recipientsMail(rmail);
       birthdaypage.buyNow();	
	}
	
	@Then("check the details entered is valid recipient name {string}")
	public void check_the_details_entered_is_valid_recipient_name(String rows) throws Exception 
	{
		datamap=DataReader.data(System.getProperty("user.dir")+"\\TestData\\ExcelData1.xlsx", "recipient_Name");

	    int index=Integer.parseInt(rows)-1;
	    String exp1=datamap.get(index).get("exp_Result");
	    
	    
	   boolean val1=birthdaypage.checkForInvalidRepName();
	   if(val1) 
	   {
		   
		   if(exp1.equalsIgnoreCase("invalid")) 
		   {
			   System.out.println("enter valid name");
			   Assert.assertTrue(true);
		   }
		   else 
		   {
			   Assert.fail();
		   }
		   
	   }
	   else
	   {
		   if(exp1.equalsIgnoreCase("valid")) 
		   {
			   
			   Assert.assertTrue(true);
		   }
		   else 
		   {
			   Assert.fail();
		   }
		   
	   }
	}
	
	
	@Then("check the details entered is valid sender mobile Number {string}")
	public void check_the_details_entered_is_valid_sender_mobileNo(String rows) throws Exception 
	{
		datamap=DataReader.data(System.getProperty("user.dir")+"\\TestData\\ExcelData1.xlsx", "sender_no");

	    int index=Integer.parseInt(rows)-1;
	    String exp1=datamap.get(index).get("exp_Result");
	    
	    
	   boolean val1=birthdaypage.checkForInvalidMobile();
	   if(val1) 
	   {
		   
		   if(exp1.equalsIgnoreCase("invalid")) 
		   {
			   System.out.println("enter valid name");
			   Assert.assertTrue(true);
		   }
		   else 
		   {
			   Assert.fail();
		   }
		   
	   }
	   else
	   {
		   if(exp1.equalsIgnoreCase("valid")) 
		   {
			   
			   Assert.assertTrue(true);
		   }
		   else 
		   {
			   Assert.fail();
		   }
		   
	   }
	}

	
	@Then("check the details entered is valid sender Recipient mailid {string}")
	public void check_the_details_entered_is_valid_sender_Recipient_mailid(String rows) throws Exception 
	{
		datamap=DataReader.data(System.getProperty("user.dir")+"\\TestData\\ExcelData1.xlsx", "recipient_Email");

	    int index=Integer.parseInt(rows)-1;
	    String exp1=datamap.get(index).get("exp_Result");
	    
	    
	   boolean val1=birthdaypage.checkForInvalidEmail();
	   if(val1) 
	   {
		   
		   if(exp1.equalsIgnoreCase("invalid")) 
		   {
			   System.out.println("enter valid name");
			   Assert.assertTrue(true);
		   }
		   else 
		   {
			   Assert.fail();
		   }
		   
	   }
	   else
	   {
		   if(exp1.equalsIgnoreCase("valid")) 
		   {
			   
			   Assert.assertTrue(true);
		   }
		   else 
		   {
			   Assert.fail();
		   }
		   
	   }
	}

}
