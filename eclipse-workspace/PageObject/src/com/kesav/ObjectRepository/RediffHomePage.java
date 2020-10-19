package com.kesav.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RediffHomePage {
	 WebDriver driver;

	 public RediffHomePage(WebDriver driver) {
		 
		 this.driver=driver;
	 }
	 By search 	= By.xpath("/html/body/div[3]/div[2]/div/form/div/input[1]");
	 By submit = By.xpath("//*[@id=\"queryTop\"]/input");
	 public WebElement Search()
	 {
		 return driver.findElement(search);
}
	 public WebElement Submit()
	 {
		 return driver.findElement(submit);
}
}

