package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class MenuMonitorComputerComponents {
	WebDriver driver;

	 public MenuMonitorComputerComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[3]")
	 WebElement allMobilePhoes;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[4]")
	 WebElement allMobileAccesso;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[5]")
	 WebElement CasesCovers;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[6]")
	 WebElement screenProtectors;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[7]")
	 WebElement powerBanks;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[8]")
	 WebElement refurbishedOpenBox;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[9]")
	 WebElement tablets;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[10]")
	 WebElement wearblesDevices;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[11]")
	 WebElement smartHome;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[12]")
	 WebElement officeSuppliesStationary;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[13]")
	 WebElement software;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[16]")
	 WebElement allComputerAccessories;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[17]")
	 WebElement laptops;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[18]")
	 WebElement drivesStorage;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[19]")
	 WebElement printerInk;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[20]")
	 WebElement networkingDevices;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[21]")
	 WebElement computerAccesso;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[22]")
	 WebElement gamesZones;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[23]")
	 WebElement monitors;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[24]")
	 WebElement desktops;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[25]")
	 WebElement components;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[26]")
	 WebElement allElectronics;
	 
	 public void allMobilePhoes()
	 {
		 allMobilePhoes.click();		 
	 }
	 public void allMobileAccesso()
	 {
		 allMobileAccesso.click();		 
	 }
	 public void CasesCovers()
	 {
		 CasesCovers.click();		 
	 }
	 
	 public void screenProtectors()
	 {
		 screenProtectors.click();		 
	 }
	 public void powerBanks()
	 {
		 powerBanks.click();		 
	 }
	 public void tablets()
	 {
		 tablets.click();		 
	 }
		 
	 public void wearblesDevices()
	 {
		 wearblesDevices.click();		 
	 }
	 public void officeSuppliesStationary()
	 {
		 officeSuppliesStationary.click();		 
	 }
	 public void software()
	 {
		 software.click();		 
	 }
	 public void allComputerAccessories()
	 {
		 allComputerAccessories.click();		 
	 }
	 public void laptops()
	 {
		 laptops.click();		 
	 }
	 public void drivesStorage()
	 {
		 drivesStorage.click();		 
	 }
	 public void printerInk()
	 {
		 printerInk.click();		 
	 }
	 public void networkingDevices()
	 {
		 networkingDevices.click();		 
	 }
	 public void computerAccesso()
	 {
		 computerAccesso.click();		 
	 }
	 public void gamesZones()
	 {
		 gamesZones.click();		 
	 }
	 public void monitors()
	 {
		 monitors.click();		 
	 }
	 public void desktops()
	 {
		 desktops.click();		 
	 }
	 public void components()
	 {
		 components.click();		 
	 }
	 public void allElectronics()
	 {
		 allElectronics.click();		 
	 }
}
