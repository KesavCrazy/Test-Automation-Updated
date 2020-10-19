package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class MobileBrandsCheckBox {
	WebDriver driver;

	 public MobileBrandsCheckBox(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"p_89/Samsung\"]/span/a/span")
	 WebElement samsung;
	 
	 @FindBy(xpath="//*[@id=\"p_89/OnePlus\"]/span/a/span")
	 WebElement onePlus;
	 
	 @FindBy(xpath="//*[@id=\"p_89/Boat\"]/span/a/span")
	 WebElement boat;
	 
	 @FindBy(xpath="//*[@id=\"p_89/Redmi\"]/span/a/span")
	 WebElement redmi;
	 
	 @FindBy(xpath="//*[@id=\"p_89/realme\"]/span/a/span")
	 WebElement realMe;
	 
	 @FindBy(xpath="//*[@id=\"p_89/Oppo\"]/span/a/span")
	 WebElement oppo;
	 
	 @FindBy(xpath="//*[@id=\"p_89/Mi\"]/span/a/span")
	 WebElement mi;
	 
	 public void Samsung()
	 {
		 samsung.click();
	 }
	 public void OnePlus()
	 {
		 onePlus.click();	 
	 }
	 public void Boat()
	 {
		 boat.click();
	 }
	 public void Redmi()
	 {
		 redmi.click(); 
	 }
	 public void RealMe()
	 {
		 realMe.click(); 
	 }
	 public void Oppo()
	 {
		 oppo.click();
	 }
	 public void MI()
	 {
		 mi.click();
	 }
	 
}
