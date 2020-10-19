package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class HomeToolBarComponents {
	WebDriver driver;

	 public HomeToolBarComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[1]")
	 WebElement mobiles;
	 
	 @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[2]")
	 WebElement todaysDeal;
	 
	 @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[3]")
	 WebElement bestSeller;
	 
	 @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[4]")
	 WebElement computers;
	 
	 @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[5]")
	 WebElement pantry;
	 
	 @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[6]")
	 WebElement books;
	 
	 @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[7]")
	 WebElement giftIdeas;
	 
	 @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[8]")
	 WebElement newReleaase;
	 

	 public void mobiles()
	 {
		 mobiles.click();		 
	 }
	 public void todaysDeal()
	 {
		 todaysDeal.click();		 
	 }
	 public void bestSeller()
	 {
		 bestSeller.click();		 
	 }
	 public void computers()
	 {
		 computers.click();		 
	 }
	 
	 public void pantry()
	 {
		 pantry.click();		 
	 }
	 public void books()
	 {
		 books.click();		 
	 }
	 public void giftIdeas()
	 {
		 giftIdeas.click();		 
	 }
	 public void newReleaase()
	 {
		 newReleaase.click();		 
	 }
	
	 
}
