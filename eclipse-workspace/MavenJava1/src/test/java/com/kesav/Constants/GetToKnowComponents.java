package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.Utility.BaseTest;

public class GetToKnowComponents {
	WebDriver driver;

	 public GetToKnowComponents(WebDriver driver) {
		 
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
	 
	 public void AboutUs()
	 {
		  aboutUs.click();
}
	 public void ContinueReading()
	 {
		  continueReading.click();
}
	 public void Career()
	 {
		  career.click();
}
	 public void PressRelease()
	 {
		  pressRelease.click();
}
	 public void AmazonCares()
{
	  amazonCares.click();
}
	 public void GiftASmile()
{
	  giftASmile.click();
}
	 public void Facebook()
{
	  facebook.click();
}
	 public void Twitter()
{
	  twitter.click();
}
	 public void Instagram()
{
	  instagram.click();
}
	 public void SellOnAmzon()
{
	  sellOnAmzon.click();
}
	 public void SellunderAmazon()
{
	  sellunderAmazon.click();
}
	 public void BecomeAnAffi()
{
	  becomeAnAffi.click();
}
	 public void FulfilmentByAmazon()
{
	  fulfilmentByAmazon.click();
}
	 public void AdvertiseYourPrduct()
{
	  advertiseYourPrduct.click();
}
	 public void AmzPayOn()
	 {
	 	  amzPayOn.click();
	 }
	 public void covidAmzon()
	 {
	 	  covidAmzon.click();
	 }
	 public void yourAcc()
	 {
	 	  yourAcc.click();
	 }
	 public void returnsCentre()
	 {
	 	  returnsCentre.click();
	 }
	 public void purchaseProtection()
	 {
	 	  purchaseProtection.click();
	 }
	 public void amzAppDownload()
	 {
	 	  amzAppDownload.click();
	 }
	 public void amzAssDownload()
	 {
	 	  amzAssDownload.click();
	 }
	 public void Help()
	 {
	 	  help.click();
	 }
}