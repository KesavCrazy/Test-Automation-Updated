package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonFullStoreDirect {
	WebDriver driver;

		 public AmazonFullStoreDirect(WebDriver driver) {
			 
			 this.driver=driver;
			 PageFactory.initElements(driver, this);
		 }
		 @FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
		 WebElement homeMenu;
		 
		 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[22]/a")
		 WebElement fullStoreDir;
		
		 @FindBy(xpath="//*[@id=\"shopAllLinks\"]/tbody/tr/td[3]/div[3]/ul/li[1]/a")
		 WebElement cricket;
		
		 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[6]/div/li[1]/span/span/div/label/input")
		 WebElement cosco;
		
		 @FindBy(xpath="//*[@id=\"low-price\"]")
		 WebElement minPrice;
		 
		 @FindBy(xpath="//*[@id=\"high-price\"]")
		 WebElement maxPrice;
		
		 @FindBy(xpath="//*[@id=\"a-autoid-1\"]/span/input")
		 WebElement go;
		 
		 @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[9]/div/span/div/div/span/a/div/img")
		 WebElement menBattingPad;
		
		 @FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
		 WebElement addToCart;
	
		 public WebElement HomeMenu()
		 {
			 return homeMenu;
	}
		 public WebElement FullStoreDir()
		 {
			 return fullStoreDir;
	}
		 public WebElement Cricket()
		 {
			 return cricket;
	}
		 public WebElement Cosco()
		 {
			 return cosco;
	}
		 public WebElement minPrice()
		 {
			 return minPrice;
	}
		 public WebElement MaxPrice()
		 {
			 return maxPrice;
	}
		 public WebElement Go()
		 {
			 return go;
	}
		 public WebElement AddToCart()
		 {
			 return addToCart;
	}
}
