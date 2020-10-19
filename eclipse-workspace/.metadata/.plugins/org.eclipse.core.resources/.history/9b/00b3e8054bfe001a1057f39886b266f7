package PageObject;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Cucumber.Automation.ExcelSheet;


public class HomePage2 {
	
		WebDriver driver;
		 public String credentialInfo;

		 public HomePage2(WebDriver driver) {
			 
			 this.driver=driver;
			 PageFactory.initElements(driver, this);

		 }
		
		 	By search	 = By.xpath("//input[@type='search']");
		 	By addToCart = By.xpath("//button[contains(text(),'ADD TO CART')]");
		 	By cart = By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]");
		 	By checkout = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
		 	
			public void getSearch() {
				
				 driver.findElement(search).sendKeys("Cucumber");
				 
			}
			public void getAddtoCart() {
				
				 driver.findElement(addToCart).click();
				 
			}
			public void getCart() {
				
				 driver.findElement(cart).click();
				 
			}
			public void getCheckout() {
				
				 driver.findElement(checkout).click();
				 
			}
			
	}

