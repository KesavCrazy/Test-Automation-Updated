package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class MenuSportsFitnessBagComponents {
	WebDriver driver;

	 public MenuSportsFitnessBagComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[3]")
	 WebElement cricket;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[4]")
	 WebElement badminton;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[5]")
	 WebElement cycling;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[6]")
	 WebElement football;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[7]")
	 WebElement running;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[8]")
	 WebElement campingHiking;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[9]")
	 WebElement fitnessAccesso;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[10]")
	 WebElement yoga;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[11]")
	 WebElement strengthTraining;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[12]")
	 WebElement cardioEquipment;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[13]")
	 WebElement refurbishedOpenBox;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[14]")
	 WebElement allExerciseFitness;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[15]")
	 WebElement sportCollectibles;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[16]")
	 WebElement allSportsFitnessOutdoor;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[19]")
	 WebElement backPacks;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[20]")
	 WebElement rucksacks;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[21]")
	 WebElement suitcaseTrolleyBags;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[22]")
	 WebElement travelDuffles;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[23]")
	 WebElement travelAccesso;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[24]")
	 WebElement wallets;

	 
	 
	 public void cricket()
	 {
		 cricket.click();		 
	 }
	 public void badminton()
	 {
		 badminton.click();		 
	 }
	 public void cycling()
	 {
		 cycling.click();		 
	 }
	 
	 public void football()
	 {
		 football.click();		 
	 }
	 public void running()
	 {
		 running.click();		 
	 }
	 public void campingHiking()
	 {
		 campingHiking.click();		 
	 }
		 
	 public void fitnessAccesso()
	 {
		 fitnessAccesso.click();		 
	 }
	 public void yoga()
	 {
		 yoga.click();		 
	 }
	 public void strengthTraining()
	 {
		 strengthTraining.click();		 
	 }
	 public void cardioEquipment()
	 {
		 cardioEquipment.click();		 
	 }
	 public void refurbishedOpenBox()
	 {
		 refurbishedOpenBox.click();		 
	 }
	 public void allExerciseFitness()
	 {
		 allExerciseFitness.click();		 
	 }
	 public void backPacks()
	 {
		 backPacks.click();		 
	 }	
	 public void allSportsFitnessOutdoor()
	 {
		 allSportsFitnessOutdoor.click();		 
	 }
	 public void rucksacks()
	 {
		 rucksacks.click();		 
	 }
	 public void suitcaseTrolleyBags()
	 {
		 suitcaseTrolleyBags.click();		 
	 }
	 public void travelDuffles()
	 {
		 travelDuffles.click();		 
	 }
	 public void travelAccesso()
	 {
		 travelAccesso.click();		 
	 }
	 public void sportCollectibles()
	 {
		 sportCollectibles.click();		 
	 }
	 public void wallet()
	 {
		 wallets.click();		 
	 }
}
