package com.kesav.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RediffLoginPage {
	 WebDriver driver;

	 public RediffLoginPage(WebDriver driver) {
		 
		 this.driver=driver;
	 }
	 By userName = By.xpath("//*[@id=\"login1\"]");
	 By password = By.name("passwd");
	 By login = By.name("proceed");
	 By home = By.xpath("/html/body/div/div[1]/div[1]/div[1]/a");
	 
	 public WebElement EmailId()
	 {
		 return driver.findElement(userName);
}
	 public WebElement Password()
	 {
		 return driver.findElement(password);
}
	 public WebElement Login()
	 {
		 return driver.findElement(login);
}
	 public WebElement Home()
	 {
		 return driver.findElement(home);
}
}

