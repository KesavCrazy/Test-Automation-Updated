package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMobComputer {
	WebDriver driver;

		 public AmazonMobComputer(WebDriver driver) {
			 
			 this.driver=driver;
			 PageFactory.initElements(driver, this);
		 }
		 @FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
		 WebElement homeMenu;
		 
		 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[9]/a/div")
		 WebElement mobileComputer;
		
		 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[3]/a")
		 WebElement allMobilePhones;
		
		 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[1]/ul/div/li[2]/span/a/span")
		 WebElement smartMobBasic;
		 
		 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[3]/div/li[3]/span/span/div/label/input")
		 WebElement nokia;
		 
		 @FindBy(xpath="//*[@id=\"low-price\"]")
		 WebElement minPrice;
		 
		 @FindBy(xpath="//*[@id=\"high-price\"]")
		 WebElement maxPrice;
		
		 @FindBy(xpath="//*[@id=\"a-autoid-1\"]/span/input")
		 WebElement go;
	
		 public WebElement HomeMenu()
		 {
			 return homeMenu;
	}
		 public WebElement MobileComputer()
		 {
			 return mobileComputer;
	}
		 public WebElement AllMobilePhones()
		 {
			 return allMobilePhones;
	}
		 public WebElement SmartMobBasic()
		 {
			 return smartMobBasic;
	}
		 public WebElement Nokia()
		 {
			 return nokia;
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
		
}
