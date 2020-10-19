package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AmazonProductBook {
	WebDriver driver;

	 public AmazonProductBook(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[7]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img")
	 WebElement productBook;
	 
	 @FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	 WebElement addToCart;
	 
	 public WebElement ProductBook()
	 {
		 return productBook;
}
	 public WebElement AddToCart()
	 {
		 return addToCart;
}
	
}
