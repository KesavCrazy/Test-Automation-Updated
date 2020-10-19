package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonAudibleAudioBook {
	WebDriver driver;

		 public AmazonAudibleAudioBook(WebDriver driver) {
			 
			 this.driver=driver;
			 PageFactory.initElements(driver, this);
		 }
		 @FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
		 WebElement homeMenu;
		 
		 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul/li[5]/a")
		 WebElement adibleAudioBook;
		
		 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[5]/a")
		 WebElement bestSeller;
		
		 @FindBy(xpath="//*[@id=\"zg-ordered-list\"]/li[6]/span/div/span/a/span/div/img")
		 WebElement product;
	
		 public WebElement HomeMenu()
		 {
			 return homeMenu;
	}
		 public WebElement adibleAudioBook()
		 {
			 return adibleAudioBook;
	}
		 public WebElement bestSeller()
		 {
			 return bestSeller;
	}
		 public WebElement product()
		 {
			 return product;
	}
		 
}
