package com.kesav.SeleniumPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            
            
            String baseUrl = "http://demo.guru99.com/test/drag_drop.html";
            driver.get(baseUrl);
            driver.manage().window().maximize();
            Actions act= new Actions(driver);
            act.pause(3000).perform();
            
            WebElement From = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
            WebElement To = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
            act.dragAndDrop(From, To).build().perform();
            
            WebElement From1 = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[4]/a"));
            WebElement To1 = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));
            act.dragAndDrop(From1, To1).build().perform();
            
	}
}
