package com.kesav.SeleniumPrac;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.Select;

public class SizeOfCheckBoxes {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");

			  WebDriver driver = new ChromeDriver();

		        driver.get("http:spicejet.com");
		        List<WebElement> i = driver.findElements(By.xpath("//*[@id=\"discount-checkbox\"]"));

		        for(WebElement d:i)
		        {
		        	System.out.println(d.getText());
		        }
		        int c = driver.findElements(By.cssSelector("input[type='checkbox'")).size();
		        System.out.println(c);
	}
}
