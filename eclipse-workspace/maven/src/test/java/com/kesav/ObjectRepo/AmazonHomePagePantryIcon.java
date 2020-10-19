package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePagePantryIcon {

	WebDriver driver;

	 public AmazonHomePagePantryIcon(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[5]")
	 WebElement pantry;
	 
	 @FindBy(xpath="//*[@id=\"a-autoid-11-announce\"]")
	 WebElement noOfItemsDropDown;
	 				
	 @FindBy(xpath="//*[@id=\"dropdown1_2\"]")
	 WebElement noOfItems;
	 				
	 @FindBy(xpath="//*[@id=\"a-autoid-12\"]/span/input")
	 WebElement addToCart;
	                
	 
	
	 public WebElement Pantry()
	 {
		 return pantry;
}
	 public WebElement NoOfItemsDropDown()
	 {
		 return noOfItemsDropDown;
}
	 public WebElement NoOfItems()
	 {
		 return noOfItems;
}

	 public WebElement AddToCart()
	 {
		 return addToCart;
}
	 
	 
}
