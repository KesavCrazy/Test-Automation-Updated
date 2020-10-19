package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.Utility.BaseTest;

public class MenuAudibleAudioBookComponents {
	WebDriver driver;

	 public MenuAudibleAudioBookComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[3]")
	 WebElement audibleMember;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[4]")
	 WebElement allAudioBooks;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[5]")
	 WebElement bestSellers;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[6]")
	 WebElement newRelease;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[7]")
	 WebElement hindiAudioBooks;

	 public void AudibleMember()
	 {
		 audibleMember.click();		 
	 }
	 public void AllAudioBooks()
	 {
		 allAudioBooks.click();		 
	 }
	 public void BestSeller()
	 {
		 bestSellers.click();		 
	 }
	 
	 public void NewRelease()
	 {
		 newRelease.click();		 
	 }
	 public void HindiAudioBooks()
	 {
		 hindiAudioBooks.click();		 
	 }	 
}
