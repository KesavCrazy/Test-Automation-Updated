package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.kesav.Utility.BaseTest;

public class MenuBooksComponents {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(HomeMenuComponents.class.getName());
	
	 public MenuBooksComponents(WebDriver driver, ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 PageFactory.initElements(driver, this);
	 }

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[17]/li[3]")
	 WebElement allBooks;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[17]/li[4]")
	 WebElement fictionBooks;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[17]/li[5]")
	 WebElement EditorCorner;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[17]/li[6]")
	 WebElement schoolTextbooks;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[17]/li[7]")
	 WebElement childrenBooks;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[17]/li[8]")
	 WebElement examCentral;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[17]/li[9]")
	 WebElement textbooks;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[17]/li[10]")
	 WebElement indianLanguageBooks;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[17]/li[11]")
	 WebElement kindleEBooks;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[17]/li[14]")
	 WebElement audibleAudioBooks;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[17]/li[15]")
	 WebElement audibleMembership;
	 
	 public void allBooks()
	 {
		 try
			{
			 allBooks.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("allBooks : Clicked", color.GREEN));
			 log.debug("allBooks Not Clicked");
			 
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("allBooks : Not Clicked", color.RED));
		    	 log.error("allBooks Not Clicked");
		    	 throw new NoSuchElementException(null);
		}		 
	 }
	 public void fictionBooks()
	 {
		 fictionBooks.click();		 
	 }
	 public void EditorCorner()
	 {
		 EditorCorner.click();		 
	 }
	 
	 public void schoolTextbooks()
	 {
		 schoolTextbooks.click();		 
	 }
	 public void childrenBooks()
	 {
		 childrenBooks.click();		 
	 }
	 public void examCentral()
	 {
		 examCentral.click();		 
	 }
		 
	 public void textbooks()
	 {
		 textbooks.click();		 
	 }
	 public void indianLanguageBooks()
	 {
		 indianLanguageBooks.click();		 
	 }
	 public void kindleEBooks()
	 {
		 kindleEBooks.click();		 
	 }
	 public void audibleAudioBooks()
	 {
		 audibleAudioBooks.click();		 
	 }
	 public void audibleMembership()
	 {
		 audibleMembership.click();		 
	 }
	
}
