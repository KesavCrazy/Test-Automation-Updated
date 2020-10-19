package com.kesav.SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise");
        driver.findElement(By.xpath("//*[@id=\"autosuggest\"]")).sendKeys("ind");
        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.xpath("/html/body/ul[1]/li[2]/a"));
        for (WebElement option :options)
        {
        	if(option.getText().equals("India"));
        	{
        		option.click();
        	}
        }
	}
}