package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class MenuBooksComponents {
	WebDriver driver;

	 public MenuBooksComponents(WebDriver driver) {
		 
		 this.driver=driver;
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
		 allBooks.click();		 
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
