package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.Utility.BaseTest;

public class MenuFireTVStickComponents {
	WebDriver driver;

	 public MenuFireTVStickComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[3]/li[3]")
	 WebElement fireTvVoiceRemote;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[3]/li[4]")
	 WebElement fireTvStick4K;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[3]/li[5]")
	 WebElement amazonPrimeVideo;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[3]/li[6]")
	 WebElement fireTvAppsGames;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[3]/li[7]")
	 WebElement seeAllFireTvDevices;

	 public void FireTvVoiceRemote()
	 {
		 fireTvVoiceRemote.click();		 
	 }
	 public void FireTvStick4K()
	 {
		 fireTvStick4K.click();		 
	 }
	 public void AmazonPrimeVideo()
	 {
		 amazonPrimeVideo.click();		 
	 }
	 
	 public void FireTvAppsGames()
	 {
		 fireTvAppsGames.click();		 
	 }
	 public void SeeAllFireTvDevices()
	 {
		 seeAllFireTvDevices.click();		 
	 }	 
}
