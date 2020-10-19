package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class StarRatings {
	WebDriver driver;

	 public StarRatings(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"p_72/1318476031\"]/span/a/section/i")
	 WebElement fourStarsAbove;
	 
	 @FindBy(xpath="//*[@id=\"p_72/1318477031\"]/span/a/section/i")
	 WebElement threeStarsAbove;
	 
	 @FindBy(xpath="//*[@id=\"p_72/1318478031\"]/span/a/section/i")
	 WebElement twoStarsAbove;
	 
	 @FindBy(xpath="//*[@id=\"p_72/1318479031\"]/span/a/section/i")
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
