package com.kesav.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RediffHomePagePF {
	 WebDriver driver;

	 public RediffHomePagePF(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="/html/body/div[3]/div[2]/div/form/div/input[1]")
	 WebElement search;
	 @FindBy(xpath="//*[@id=\"queryTop\"]/input")
	 WebElement submit;
	 
	 public WebElement Search()
	 {
		 return search;
}
	 public WebElement Submit()
	 {
		 return submit;
}
}

