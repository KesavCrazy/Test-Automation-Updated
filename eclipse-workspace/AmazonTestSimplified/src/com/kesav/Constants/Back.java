package com.kesav.Constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Back {
	WebDriver driver;

	 public Back(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 public void ComeBack() {
		 driver.navigate().back();
	 }
}
