package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductOrder {
	WebDriver driver;

	 public AmazonProductOrder(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[1]/div/div/select")
	 WebElement allIconDropDown;
	 
	 @FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")
	 WebElement searchBox;
	 
	 @FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")
	 WebElement go;
	                
	 @FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
	 WebElement product;
	
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[3]/div[3]/div[1]/div[3]/div/div/div/form/div/div/div/div/div[2]/div/div[30]/div[1]/span/span/span/input")
	 WebElement addToCart;
	 
	 @FindBy(xpath=" /html/body/div[1]/div/div[3]/div[2]/div[1]/div/div/div[2]")
	 WebElement addedToCartMsg;
	
	
	 public WebElement AllIconDropDown()
	 {
		 return allIconDropDown;
}
	 public WebElement SearchBox()
	 {
		 return searchBox;
}
	 public WebElement Go()
	 {
		 return go;
}
	 public WebElement Product()
	 {
		 return product;
}
	 public WebElement addToCart()
	 {
		 return addToCart;
}
	 public WebElement addedToCartMsg()
	 {
		 return addedToCartMsg;
}
}
