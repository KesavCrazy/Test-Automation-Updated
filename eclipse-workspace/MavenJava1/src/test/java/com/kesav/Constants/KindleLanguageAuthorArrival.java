package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.Utility.BaseTest;

public class KindleLanguageAuthorArrival {
	WebDriver driver;

	 public KindleLanguageAuthorArrival(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[3]/div/li[1]")
	 WebElement english;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[3]/div/li[2]")
	 WebElement hindi;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[3]/div/li[3]")
	 WebElement tamil;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[3]/div/li[4]")
	 WebElement marathi;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[3]/div/li[5]")
	 WebElement malayalam;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[3]/div/li[6]")
	 WebElement gujarati;
	
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[4]/div/li[1]")
	 WebElement seanPatrik;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[4]/div/li[2]")
	 WebElement dariusForoux;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[4]/div/li[3]")
	 WebElement joelVillar;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[4]/div/li[4]")
	 WebElement dalecarnegia;
	 
	 @FindBy(xpath="//*[@id=\\\"leftNav\\\"]/ul[4]/div/li[5]")
	 WebElement justinHammond;
	 
	 @FindBy(xpath="//*[@id=\\\"leftNav\\\"]/ul[4]/div/li[6]")
	 WebElement fabianNicieza;
	 
	 @FindBy(xpath="//*[@id=\\\"leftNav\\\"]/ul[4]/div/li[7]")
	 WebElement preetiShenoy;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[3]/li/span/a/span")
	 WebElement seeMore;
	 
	 @FindBy(xpath="//*[@id=\"attrSuggestField\"]")
	 WebElement suggestField;
	
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[2]/div/li[1]")
	 WebElement last30Days;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[2]/div/li[2]")
	 WebElement last90Days;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[2]/div/li[3]")
	 WebElement comingSoon;
	 
	 public void English()
	 {
		 english.click();
	 }
	 public void Hindi()
	 {
		 hindi.click();	 
	 }
	 public void Tamil()
	 {
		 tamil.click();
	 }
	 public void Marathi()
	 {
		 marathi.click(); 
	 }
	 public void Malayalam()
	 {
		 malayalam.click(); 
	 }
	 public void Gujarathi()
	 {
		 gujarati.click(); 
	 }
	 public void SeanPatrik()
	 {
		 seanPatrik.click();
	 }
	 public void DariusForoux()
	 {
		 dariusForoux.click();
	 }
	 public void JoelVillar()
	 {
		 joelVillar.click();
	 }
	 public void Dalecarnegia()
	 {
		 dalecarnegia.click();
	 }
	 public void JustinHammond()
	 {
		 justinHammond.click();
	 }
	 public void FabianNicieza()
	 {
		 fabianNicieza.click();
	 }
	 public void PreetiShenoy()
	 {
		 preetiShenoy.click();
	 }
	 public void Last30Days()
	 {
		 last30Days.click();
	 }
	 public void Last90Days()
	 {
		 last90Days.click();
	 }
	 public void ComingSoon()
	 {
		 comingSoon.click();
	 }
	 public void SeeMore()
	 {
		 seeMore.click();
	 }
	 public void SuggestField()
	 {
		 suggestField.sendKeys("allan");
	 }
	 
}
