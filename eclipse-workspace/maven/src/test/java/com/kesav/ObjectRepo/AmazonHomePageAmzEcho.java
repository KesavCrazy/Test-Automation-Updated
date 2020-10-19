package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageAmzEcho {

	WebDriver driver;

	 public AmazonHomePageAmzEcho(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"MlHBk5Gkfht_8J9H_2pxtg\"]/div[2]/div[2]/div[2]/a/div[1]/img")
	 WebElement echo;
	 
	 @FindBy(xpath="//*[@id=\"SMP_caret\"]")
	 WebElement fireTVDropDown;
	 				
	 @FindBy(xpath="//*[@id=\"fs-card-B079QQZZJK\"]/a/div/img")
	 WebElement fireTV4K;
	 				
	 @FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	 WebElement addToCart;
	                
	 public WebElement Echo()
	 {
		 return echo;
}
	 public WebElement FireTVDropDown()
	 {
		 return fireTVDropDown;
}
	 public WebElement FireTV4K()
	 {
		 return fireTV4K;
}

	 public WebElement AddToCart()
	 {
		 return addToCart;
}
	 
	 
}
