package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.kesav.Utility.BaseTest;

public class QuantityAddToCartBuyNow {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(HomeMenuComponents.class.getName());
	
	public QuantityAddToCartBuyNow(WebDriver driver,ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"quantity\"]")
	 WebElement quantity;
	 
	 @FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	 WebElement addToCart;
	 
	 @FindBy(xpath="//*[@id=\"buy-now-button\"]")
	 WebElement buyNowButton;

	 @FindBy(xpath="//a[@id='hlb-view-cart-announce']")
	 WebElement cart;
	
	 @FindBy(xpath="//span[@class='a-dropdown-label']")
	 WebElement dropdownLabel;

	 @FindBy(xpath="//a[@id='dropdown1_3']")
	 WebElement dropdownLabel3;

	 @FindBy(xpath="//div[@class='a-row sc-action-links']//input[@name='submit.save-for-later.Cc2a390af-3ad9-495f-acfd-9dd3d9473500']")
	 WebElement saveForLater;
	
	 public void Quantity()
	 {
		 try
			
		 {
			 new Select(quantity).selectByVisibleText("3");	
			 	test.log(Status.PASS, MarkupHelper.createLabel("Quantity : Clicked", color.GREEN));
				log.debug("Quantity Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("Quantity : Not Clicked", color.RED));
		    	log.error("Quantity Not Clicked");
		    	throw new NoSuchElementException(null);
		}
		
	 }
	 public void AddToCart()
	 {
		 try
			
		 {
			 addToCart.click();	
			 	test.log(Status.PASS, MarkupHelper.createLabel("addToCart : Clicked", color.GREEN));
				log.debug("addToCart Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("addToCart : Not Clicked", color.RED));
		    	log.error("addToCart Not Clicked");
		    	throw new NoSuchElementException(null);
		}
			 
	 }
	 public void BuyNowButton()
	 {
		 buyNowButton.click();		 
	 }
	 public void cart()
	 {
		 try
			
		 {
			    cart.click();
			 	test.log(Status.PASS, MarkupHelper.createLabel("cart : Clicked", color.GREEN));
				log.debug("cart Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("cart : Not Clicked", color.RED));
		    	log.error("cart Not Clicked");
		    	throw new NoSuchElementException(null);
		}
	 }
		 public void dropdownLabel()
		 {
			 try
				
			 {
				    dropdownLabel.click();
				 	test.log(Status.PASS, MarkupHelper.createLabel("dropdownLabel : Clicked", color.GREEN));
					log.debug("dropdownLabel Clicked");	 
			 }
				
			    catch(NoSuchElementException e) {
			    	test.log(Status.FAIL, MarkupHelper.createLabel("dropdownLabel : Not Clicked", color.RED));
			    	log.error("dropdownLabel Not Clicked");
			    	throw new NoSuchElementException(null);
			}
		 }
			 public void dropdownLabel3()
			 {
				 try
					
				 {
					    dropdownLabel3.click();
					 	test.log(Status.PASS, MarkupHelper.createLabel("dropdownLabel3 : Clicked", color.GREEN));
						log.debug("dropdownLabel3 Clicked");	 
				 }
					
				    catch(NoSuchElementException e) {
				    	test.log(Status.FAIL, MarkupHelper.createLabel("dropdownLabel3 : Not Clicked", color.RED));
				    	log.error("dropdownLabel3 Not Clicked");
				    	throw new NoSuchElementException(null);
				}
			 }
				 public void saveForLater()
				 {
					 try
						
					 {
						    saveForLater.click();
						 	test.log(Status.PASS, MarkupHelper.createLabel("saveForLater : Clicked", color.GREEN));
							log.debug("saveForLater Clicked");	 
					 }
						
					    catch(NoSuchElementException e) {
					    	test.log(Status.FAIL, MarkupHelper.createLabel("saveForLater : Not Clicked", color.RED));
					    	log.error("saveForLater Not Clicked");
					    	throw new NoSuchElementException(null);
					}
					
				 }
}
