package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCreateAccountPage {
	WebDriver driver;

	 public AmazonCreateAccountPage(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);

	 }
	 @FindBy(xpath="//*[@id=\"createAccountSubmit\"]")
	 WebElement toCreateAccountPage;
	 
	 @FindBy(xpath="//*[@id=\"ap_customer_name\"]")
	 WebElement customerName;
	
	 @FindBy(xpath="//*[@id=\"auth-country-picker-container\"]/span/span/span")
	 WebElement mobDropDown;
	 
	 @FindBy(xpath="//*[@id=\"ap_phone_number\"]")
	 WebElement mobNumber;
	 
	 @FindBy(xpath="//*[@id=\"ap_email\"]")
	 WebElement emailCreateAccountPage;
	 
	 @FindBy(xpath="//*[@id=\"ap_password\"]")
	 WebElement passwordCreateAccountPage;
	 
	 @FindBy(xpath="//*[@id=\"continue\"]")
	 WebElement continueCreateAccountPage;
		 
	
	 public WebElement ToCreateAccountPage()
	 {
		 return toCreateAccountPage;
}
	
	 public WebElement CreateAccountPageCustomerName()
	 {
		 return customerName;
}
	 public WebElement CreateAccountPageMobDropDown()
	 {
		 return mobDropDown;
}
	 public WebElement CreateAccountPageMobNumber()
	 {
		 return mobNumber;
}
	 public WebElement CreateAccountPageEmail()
	 {
		 return emailCreateAccountPage;
}
	 public WebElement CreateAccountPagePassword()
	 {
		 return passwordCreateAccountPage;
}
	 public WebElement CreateAccountPagecontinue()
	 {
		 return continueCreateAccountPage;
}
}