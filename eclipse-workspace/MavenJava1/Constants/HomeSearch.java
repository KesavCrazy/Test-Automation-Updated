package com.kesav.Constants;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class HomeSearch {
	WebDriver driver;

	 public HomeSearch(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	 WebElement searchBox;
	
	 @FindBy(xpath="//*[@id=\"nav-search-submit-text\"]/input")
	 WebElement submit;
	 
	 public void Submit()
	 {
		 submit.click();
	 }
	 public void Mobiles()
	 {
		WebElement choose = searchBox;
		choose.sendKeys("mobile");
		choose.sendKeys(Keys.ARROW_DOWN);
		choose.sendKeys(Keys.ENTER);
	 }
	 public void TodaysDeal()
	 {
		 searchBox.sendKeys("best deals");		 
	 }
	 public void Soap()
	 {
		 searchBox.sendKeys("soap"); 
	 }
	 public void FiveFeetApart()
	 {
		 searchBox.sendKeys("five feet apart");	 
	 }
	 public void MenShirt()
	 {
		 searchBox.sendKeys("men shirts");		 
	 }
	 public void FlowerPots()
	 {
		 searchBox.sendKeys("flower Pots");
	 }
	 public void PsGames()
	 {
		 searchBox.sendKeys("ps4 games");		 
	 }
	 public void Printers()
	 {
		 searchBox.sendKeys("printers");		 
	 }
	
	 
}
