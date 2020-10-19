package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class MenuEchoAlexaComponents {
	WebDriver driver;

	 public MenuEchoAlexaComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[2]")
	 WebElement echoAlexa;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[3]/a")
	 WebElement echoDot;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[4]/a")
	 WebElement allNewAmazonEcho;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[5]/a")
	 WebElement echoShow8;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[6]/a")
	 WebElement echoInputPortableSpeaker;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[7]")
	 WebElement echoPlus;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[8]/a")
	 WebElement echoShow5;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[9]/a")
	 WebElement echoStudio;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[10]/a")
	 WebElement seeAllDevicesWithAlexa;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[13]/a")
	 WebElement meetAlexa;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[14]/a")
	 WebElement alexaSkills;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[15]/a")
	 WebElement alexaApp;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[16]/a")
	 WebElement alexaSmartHome;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[17]/a")
	 WebElement amzPrimeMusic;

	 public void echoAlexa()
	 {
		 echoAlexa.click();		 
	 }
	 public void echoDot()
	 {
		 echoDot.click();		 
	 }
	 public void allNewAmazonEcho()
	 {
		 allNewAmazonEcho.click();		 
	 }
	 
	 public void echoShow8()
	 {
		 echoShow8.click();		 
	 }
	 public void echoInputPortableSpeaker()
	 {
		 echoInputPortableSpeaker.click();		 
	 }
	 public void echoPlus()
	 {
		 echoPlus.click();		 
	 }
	 public void echoShow5()
	 {
		 echoShow5.click();		 
	 }
	 public void echoStudio()
	 {
		 echoStudio.click();		 
	 }
	 public void seeAllDevicesWithAlexa()
	 {
		 seeAllDevicesWithAlexa.click();		 
	 }
	 public void meetAlexa()
	 {
		 meetAlexa.click();		 
	 }
	 public void alexaSkills()
	 {
		 alexaSkills.click();		 
	 }
	 public void alexaApp()
	 {
		 alexaApp.click();		 
	 }
	 public void alexaSmartHome()
	 {
		 alexaSmartHome.click();		 
	 }
	 public void amzPrimeMusic()
	 {
		 amzPrimeMusic.click();		 
	 }
	
	 
	 
	 
}
