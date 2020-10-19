package com.kesav.SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.Select;

public class ColumnNo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/challenging_dom");
	    List<WebElement> col=driver.findElements(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/thead/tr/th"));
        System.out.println("Number of columns:" +""+ col.size());
	}
	
}
