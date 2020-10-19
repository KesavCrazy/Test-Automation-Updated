package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCovid {
	WebDriver driver;

	 public AmazonCovid(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[1]/a")
	 WebElement covid;
	 
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/ul/li[2]/a")
	 WebElement whereMyOrder;
	 
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/ul/li[3]/a")
	 WebElement amazonPrime;
	
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/ul/li[4]/a")
	 WebElement specialDeliveryOption;
	
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/ul/li[5]/a")
	 WebElement shippingSpeed;
	 
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/ul/li[6]/a")
	 WebElement orderingRestrictions;
	 
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/ul/li[7]/a")
	 WebElement pickUpStore;
	 
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/ul/li[8]/a")
	 WebElement amazonPackaging;
	 
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/ul/li[9]/a")
	 WebElement reportEmergency;
	 
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/ul/li[10]/a")
	 WebElement freeShipping;
	 
	 public WebElement Covid()
	 {
		 return covid;
}
	 public WebElement WhereMyOrder()
	 {
		 return whereMyOrder;
}
	 public WebElement AmazonPrime()
	 {
		 return amazonPrime;
}
	 public WebElement SpecialDeliveryOption()
	 {
		 return specialDeliveryOption;
}
	 public WebElement ShippingSpeed()
	 {
		 return shippingSpeed;
}
	 public WebElement OrderingRestrictions()
{
	 return orderingRestrictions;
}
	 public WebElement PickUpStore()
{
	 return pickUpStore;
}
	 public WebElement AmazonPackaging()
{
	 return amazonPackaging;
}
	 public WebElement ReportEmergency()
{
	 return reportEmergency;
}
	 public WebElement FreeShipping()
{
	 return freeShipping;
}
	 
}
