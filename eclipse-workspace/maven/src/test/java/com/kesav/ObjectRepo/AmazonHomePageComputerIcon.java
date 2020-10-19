package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageComputerIcon {

	WebDriver driver;

	 public AmazonHomePageComputerIcon(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[4]")
	 WebElement computerIcon;
	 
	 @FindBy(xpath="/html/body/div[2]/div[4]/div/div[2]/div/div[2]/div/ul[4]/div/li/span/span/div/label/input")
	 WebElement eligibleForPayOnDelivery;
	 				
	 @FindBy(xpath="//*[@id=\"p_89/Samsung\"]/span/a/div/label/i")
	 WebElement samsungCheckBox;
	 				
	 @FindBy(xpath="//*[@id=\"low-price\"]")
	 WebElement minAmount;
	                
	 @FindBy(xpath="//*[@id=\"high-price\"]")
	 WebElement maxAmount;
	 
	 @FindBy(xpath="//*[@id=\"p_72/1318477031\"]/span/a/section/i")
	 WebElement starRatings;
	
	 				
	 @FindBy(xpath="//*[@id=\"a-autoid-1\"]/span/input")
	 WebElement go;
	 
	
	 public WebElement ComputerIcon()
	 {
		 return computerIcon;
}
	 public WebElement EligibleForPayOnDelivery()
	 {
		 return eligibleForPayOnDelivery;
}
	 public WebElement SamsungCheckBox()
	 {
		 return samsungCheckBox;
}

	 public WebElement MinAmount()
	 {
		 return minAmount;
}
	 public WebElement Maxmount()
	 {
		 return maxAmount;
}
	 public WebElement StarRatings()
	 {
		 return starRatings;
}
	 public WebElement Go()
	 {
		 return go;
}
	 
}
