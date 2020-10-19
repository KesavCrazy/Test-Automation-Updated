package com.kesav.SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.Select;

public class LinksNo {
	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");

			  WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com");
		String var = driver.findElement(By.tagName("a")).getText();
		System.out.println(var);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//		int i = allLinks.size(); 
		for(WebElement i: allLinks) {
		System.out.println(i.getText());
		}
	}
}
