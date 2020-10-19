package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonBeautyHealthGrocery {
	WebDriver driver;

		 public AmazonBeautyHealthGrocery(WebDriver driver) {
			 
			 this.driver=driver;
			 PageFactory.initElements(driver, this);
		 }
		 @FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
		 WebElement homeMenu;
		 
		 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[14]/a")
		 WebElement beautyHealthGrocery;
		
		 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[13]/li[4]/a")
		 WebElement luxuryBeauty;
		
		 @FindBy(xpath="//*[@id=\"a-page\"]/div[4]/div/div[2]/div/div[1]/div[1]/ul[2]/li[2]/a")
		 WebElement luxurySkinCare;
	
		 @FindBy(xpath="//*[@id=\"a-autoid-3-announce\"]")
		 WebElement bodyWashLotions;
		 
		 @FindBy(xpath="//*[@id=\"result_1\"]/div/div[2]/div/div/a/img")
		 WebElement almondShowerOil;
		
		 public WebElement HomeMenu()
		 {
			 return homeMenu;
	}
		 public WebElement BeautyHealthGrocery()
		 {
			 return beautyHealthGrocery;
	}
		 public WebElement LuxuryBeauty()
		 {
			 return luxuryBeauty;
	}
		 public WebElement LuxurySkinCare()
		 {
			 return luxurySkinCare;
	}
		 public WebElement BodyWashLotions()
		 {
			 return bodyWashLotions;
	}
		 public WebElement AlmondShowerOil()
		 {
			 return almondShowerOil;
	}
		 
}
