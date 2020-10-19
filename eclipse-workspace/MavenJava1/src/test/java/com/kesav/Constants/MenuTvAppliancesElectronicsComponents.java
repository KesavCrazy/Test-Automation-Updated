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

public class MenuTvAppliancesElectronicsComponents {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(HomeMenuComponents.class.getName());
	
	 public MenuTvAppliancesElectronicsComponents(WebDriver driver,ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[3]")
	 WebElement televisons;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[4]")
	 WebElement homeEntertainmentSystem;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[5]")
	 WebElement headPhones;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[6]")
	 WebElement speakers;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[7]")
	 WebElement homeAudioTheatre;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[8]")
	 WebElement cameras;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[9]")
	 WebElement dslrCameras;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[10]")
	 WebElement securitycameras;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[11]")
	 WebElement cameraAccesso;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[12]")
	 WebElement musicalInstrumentsProfesAudio;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[13]")
	 WebElement gamingConsole;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[14]")
	 WebElement allElectronics;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[17]")
	 WebElement airConditioners;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[18]")
	 WebElement refrigerators;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[19]")
	 WebElement washingMachines;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[20]")
	 WebElement kitchenHomeAppliances;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[21]")
	 WebElement heatingCoolingAppliances;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[22]")
	 WebElement allAppliances;
	 
	
	 
	 public void televisons()
	 {
		 try
			{
			 televisons.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("televisons : Clicked", color.GREEN));
			 log.debug("televisons Not Clicked");
			 
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("televisons : Not Clicked", color.RED));
		    	 log.error("televisons Not Clicked");
		    	 throw new NoSuchElementException(null);
		}
	 }
	 public void homeEntertainmentSystem()
	 {
		 homeEntertainmentSystem.click();		 
	 }
	 public void headPhones()
	 {
		 headPhones.click();		 
	 }
	 
	 public void speakers()
	 {
		 speakers.click();		 
	 }
	 public void homeAudioTheatre()
	 {
		 homeAudioTheatre.click();		 
	 }
	 public void cameras()
	 {
		 cameras.click();		 
	 }
		 
	 public void dslrCameras()
	 {
		 dslrCameras.click();		 
	 }
	 public void securitycameras()
	 {
		 securitycameras.click();		 
	 }
	 public void cameraAccesso()
	 {
		 cameraAccesso.click();		 
	 }
	 public void musicalInstrumentsProfesAudio()
	 {
		 musicalInstrumentsProfesAudio.click();		 
	 }
	 public void gamingConsole()
	 {
		 gamingConsole.click();		 
	 }
	 public void allElectronics()
	 {
		 allElectronics.click();		 
	 }
	 public void airConditioners()
	 {
		 airConditioners.click();		 
	 }
	 public void refrigerators()
	 {
		 refrigerators.click();		 
	 }
	 public void washingMachines()
	 {
		 washingMachines.click();		 
	 }
	 public void kitchenHomeAppliances()
	 {
		 kitchenHomeAppliances.click();		 
	 }
	 public void heatingCoolingAppliances()
	 {
		 heatingCoolingAppliances.click();		 
	 }
	 public void allAppliances()
	 {
		 allAppliances.click();		 
	 }
	 
	
}
