package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	WebDriver driver;

	 public AmazonHomePage(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[2]/div/a[2]/span/span")
	 WebElement signInDropDown;
	 
	 @FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[2]/div/a[1]/span/span[2]/span")
	 WebElement languageDropDown;
	 
	 @FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[4]/div[9]/div[2]/a[1]/span/i")
	 WebElement chooseHindi;
	
	 @FindBy(xpath=" /html/body/div[1]/header/div/div[1]/div[4]/div[8]/div[2]/a[1]/span/i")
	 WebElement chooseEnglish;
	
	 @FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[1]/a/i")
	 WebElement amazonMenu;
	
	
	 
	 
	 public WebElement SignInDropDown()
	 {
		 return signInDropDown;
}
	 public WebElement LanguageDropDown()
	 {
		 return languageDropDown;
}
	 public WebElement ChooseHindi()
	 {
		 return chooseHindi;
}
	 public WebElement ChooseEnglish()
	 {
		 return chooseEnglish;
}
	 
}
