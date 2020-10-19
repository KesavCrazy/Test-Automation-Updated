package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageTodaysDealIcon2 {

	WebDriver driver;

	 public AmazonHomePageTodaysDealIcon2(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[2]")
	 WebElement todaysDealIcon2;
	 
	 @FindBy(xpath="//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[11]/div/label/input")
	 WebElement clothingBoysCheckBox;
	 				
	 @FindBy(xpath="//*[@id=\"widgetFilters\"]/div[4]/span/div/label/input")
	 WebElement priceCheckBox;
	 				
	 @FindBy(xpath="//*[@id=\"watchButtonText_656686cd\"]")
	 WebElement product;
	                
	 
	
	 public WebElement TodaysDealIcon2()
	 {
		 return todaysDealIcon2;
}
	 public WebElement ClothingBoysCheckBox()
	 {
		 return clothingBoysCheckBox;
}
	 public WebElement PriceCheckBox()
	 {
		 return priceCheckBox;
}

	 public WebElement Product()
	 {
		 return product;
}
	 
	 
}
