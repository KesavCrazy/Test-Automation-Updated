package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.Utility.BaseTest;

public class StarRatingsMob {
	WebDriver driver;

	 public StarRatingsMob(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[6]/div/li[1]/span/a/i")
	 WebElement fourStarsAbove;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[6]/div/li[2]/span/a/i")
	 WebElement threeStarsAbove;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[6]/div/li[3]/span/a/i")
	 WebElement twoStarsAbove;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[6]/div/li[4]/span/a/i")
	 WebElement oneStarsAbove;
	 
	 public void fourStarsAbove()
	 {
		 fourStarsAbove.click();
	 }
	 public void threeStarsAbove()
	 {
		 threeStarsAbove.click();	 
	 }
	 public void twoStarsAbove()
	 {
		 twoStarsAbove.click();
	 }
	 public void oneStarsAbove()
	 {
		 oneStarsAbove.click(); 
	 }
}
