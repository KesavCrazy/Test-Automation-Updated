package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.kesav.TestCases.BaseTest;

public class QuantityAddToCartBuyNow {
	WebDriver driver;

	 public QuantityAddToCartBuyNow(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"quantity\"]")
	 WebElement quantity;
	 
	 @FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	 WebElement addToCart;
	 
	 @FindBy(xpath="//*[@id=\"buy-now-button\"]")
	 WebElement buyNowButton;

	
	 public void Quantity()
	 {
			
		new Select(quantity).selectByVisibleText("3");
	 }
	 public void AddToCart()
	 {
		 addToCart.click();		 
	 }
	 public void BuyNowButton()
	 {
		 buyNowButton.click();		 
	 }

	 
}
