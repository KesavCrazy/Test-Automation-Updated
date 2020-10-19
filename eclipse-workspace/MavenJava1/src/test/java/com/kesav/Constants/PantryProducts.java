package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.Utility.BaseTest;

public class PantryProducts {
	WebDriver driver;

	 public PantryProducts(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"a-autoid-25-announce\"]")
	 WebElement product1Quantity;
	
	 @FindBy(xpath="//*[@id=\"a-autoid-26\"]/span/input")
	 WebElement product1AddToCart;
	 
	 @FindBy(xpath="//*[@id=\"a-autoid-27-announce\"]")
	 WebElement product2Quantity;
	 
	 @FindBy(xpath="//*[@id=\"a-autoid-28\"]/span/input")
	 WebElement product2AddToCart;
	 
	 public void product1Quantity()
	 {
		 product1Quantity.click();
	 }
	 public void product1AddToCart()
	 {
		 product1AddToCart.click();	 
	 }
	 public void product2Quantity()
	 {
		 product2Quantity.click();
	 }
	 public void product2AddToCart()
	 {
		 product2AddToCart.click(); 
	 }
}
