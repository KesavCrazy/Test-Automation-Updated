package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class AmountRangeTryCatch {
	WebDriver driver;

	 public AmountRangeTryCatch(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"p_36/1741388031\"]/span/a/span")
	 WebElement underHundred;
	 
	 @FindBy(xpath="//*[@id=\"p_36/1741389031\"]/span/a/span")
	 WebElement hundredToTwoHundred;
	 
	 @FindBy(xpath="//*[@id=\"p_36/1741390031\"]/span/a/span")
	 WebElement twoHundredToFiveHundred;
	 
	 @FindBy(xpath="//*[@id=\"p_36/1741391031\"]/span/a/span")
	 WebElement fiveHundredToThousand;
	 
	 @FindBy(xpath="//*[@id=\"p_36/1741392031\"]/span/a/span")
	 WebElement overThousand;
	 
	 @FindBy(xpath="//*[@id=\"p_36/1729357031\"]/span/a/span")
	 WebElement free;
	 
	 @FindBy(xpath="//*[@id=\"low-price\"]")
	 WebElement lowPrice;
	 
	 @FindBy(xpath="//*[@id=\"high-price\"]")
	 WebElement maxPrice;
	 
	 @FindBy(tagName="input")
	 WebElement go;
	
	 @FindBy(xpath="//*[@id=\"a-autoid-7\"]/span/input")
	 WebElement go1;

	 
	 
	 public void UnderHundred()
	 {
		 underHundred.click();
	 }
	 public void HundredToTwoHundred()
	 {
		 hundredToTwoHundred.click();	 
	 }
	 public void TwoHundredToFiveHundred()
	 {
		 twoHundredToFiveHundred.click();
	 }
	 public void FiveHundredToThousand()
	 {
		 fiveHundredToThousand.click(); 
	 }
	 public void OverThousand()
	 {
		 overThousand.click(); 
	 }
	 public void Free()
	 {
		 free.click(); 
	 }
	 public void LowPrice1()
	 {
		 lowPrice.sendKeys("100");
	 }
	 public void MaxPrice1()
	 {
		 maxPrice.sendKeys("7000");
	 }
	 public void LowPrice2()
	 {
		 lowPrice.sendKeys("40000");
	 }
	 public void MaxPrice2()
	 {
		 maxPrice.sendKeys("70000");
	 }
	 public void Go()
	 {
		 try
			{
				if(go!=null)
				{
					go.click();
				}
			}
		    catch(NoSuchElementException e) {
			go1.click();
		}
	 }
}

