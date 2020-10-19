package com.kesav.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RediffLoginPagePageFactory {
	 WebDriver driver;

	 public RediffLoginPagePageFactory(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }

	 @FindBy(xpath="//*[@id=\"login1\"]")
	 WebElement userName;
	 
	 @FindBy(name="passwd")
	 WebElement password;
	 
	 @FindBy(name="proceed")
	 WebElement login;
	 
	 @FindBy(xpath="/html/body/div/div[1]/div[1]/div[1]/a")
	 WebElement home;
	 
	 public WebElement EmailId()
	 {
		 return userName;
}
	 public WebElement Password()
	 {
		 return password;
}
	 public WebElement Login()
	 {
		 return login;
}
	 public WebElement Home()
	 {
		 return home;
}
}

