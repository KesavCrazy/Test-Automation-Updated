package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageShoppingMadeEasy {
	WebDriver driver;

	 public AmazonHomePageShoppingMadeEasy(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"navSwmHoliday\"]/a")
	 WebElement shoppingMadeEasy;
	 
	 @FindBy(xpath="//*[@id=\"mgt-email-sms-input\"]")
	 WebElement email;
	 
	 @FindBy(xpath="//*[@id=\"mgt-email-sms-send-button\"]/span/input")
	 WebElement sendTheLink;
	
	 @FindBy(xpath="//*[@id=\"mgt-email-sms-success-text\"]")
	 WebElement successText;
	
	 public WebElement ShoppingMadeEasy()
	 {
		 return shoppingMadeEasy;
}
	 public WebElement Email()
	 {
		 return email;
}
	 public WebElement SendTheLink()
	 {
		 return sendTheLink;
}
	 public WebElement SuccessText()
	 {
		 return successText;
}
	 
}
