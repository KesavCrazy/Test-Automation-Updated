package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomeGetToKnow {
	WebDriver driver;

	 public AmazonHomeGetToKnow(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")
	 WebElement aboutUs;
	 
	 @FindBy(xpath="/html/body/div[1]/main/div[2]/div/div[2]/div[2]/div/div[2]/span/div/a")
	 WebElement continueReading;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[2]/a")
	 WebElement career;
	
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[3]/a")
	 WebElement pressRelease;
	
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[4]/a")
	 WebElement amazonCares;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[5]/a")
	 WebElement giftASmile;
	
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[5]/a")
	 WebElement facebook;
	
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[2]/a")
	 WebElement twitter;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[3]/a")
	 WebElement instagram;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[1]/a")
	 WebElement sellOnAmzon;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[2]/a")
	 WebElement sellunderAmazon;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[4]/a")
	 WebElement becomeAnAffi;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[5]/a")
	 WebElement fulfilmentByAmazon;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[6]/a")
	 WebElement advertiseYourPrduct;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[3]/a")
	 WebElement amzPayOn;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[1]/a")
	 WebElement covidAmzon;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[3]/a")
	 WebElement yourAcc;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[3]/a")
	 WebElement returnsCentre;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[3]/a")
	 WebElement purchaseProtection;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[3]/a")
	 WebElement amzAppDownload;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[3]/a")
	 WebElement amzAssDownload;
	 
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[3]/a")
	 WebElement help;
	 
	 public WebElement AboutUs()
	 {
		 return aboutUs;
}
	 public WebElement ContinueReading()
	 {
		 return continueReading;
}
	 public WebElement Career()
	 {
		 return career;
}
	 public WebElement PressRelease()
	 {
		 return pressRelease;
}
	 public WebElement AmazonCares()
{
	 return amazonCares;
}
	 public WebElement GiftASmile()
{
	 return giftASmile;
}
	 public WebElement Facebook()
{
	 return facebook;
}
	 public WebElement Twitter()
{
	 return twitter;
}
	 public WebElement Instagram()
{
	 return instagram;
}
	 public WebElement SellOnAmzon()
{
	 return sellOnAmzon;
}
	 public WebElement SellunderAmazon()
{
	 return sellunderAmazon;
}
	 public WebElement BecomeAnAffi()
{
	 return becomeAnAffi;
}
	 public WebElement FulfilmentByAmazon()
{
	 return fulfilmentByAmazon;
}
	 public WebElement AdvertiseYourPrduct()
{
	 return advertiseYourPrduct;
}
	 public WebElement AmzPayOn()
	 {
	 	 return amzPayOn;
	 }
	 public WebElement covidAmzon()
	 {
	 	 return covidAmzon;
	 }
	 public WebElement yourAcc()
	 {
	 	 return yourAcc;
	 }
	 public WebElement returnsCentre()
	 {
	 	 return returnsCentre;
	 }
	 public WebElement purchaseProtection()
	 {
	 	 return purchaseProtection;
	 }
	 public WebElement amzAppDownload()
	 {
	 	 return amzAppDownload;
	 }
	 public WebElement amzAssDownload()
	 {
	 	 return amzAssDownload;
	 }
	 public WebElement Help()
	 {
	 	 return help;
	 }
	 
	
}
