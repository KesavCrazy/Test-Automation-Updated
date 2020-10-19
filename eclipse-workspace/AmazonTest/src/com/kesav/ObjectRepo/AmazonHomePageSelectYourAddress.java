package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageSelectYourAddress {
	WebDriver driver;

	 public AmazonHomePageSelectYourAddress(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"glow-ingress-line2\"]")
	 WebElement selectYourAddress;
	 
	 @FindBy(xpath="//*[@id=\"GLUXZipUpdateInput\"]")
	 WebElement pincode;
	 
	 @FindBy(xpath="//*[@id=\"GLUXZipUpdate\"]/span/input")
	 WebElement apply;
	
	 @FindBy(xpath="//*[@id=\"mgt-email-sms-success-text\"]")
	 WebElement successText;
	
	 public WebElement SelectYourAddress()
	 {
		 return selectYourAddress;
}
	 public WebElement Pincode()
	 {
		 return pincode;
}
	 public WebElement Apply()
	 {
		 return apply;
}
	 public WebElement SuccessText()
	 {
		 return successText;
}
	 
}
