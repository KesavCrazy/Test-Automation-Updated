package com.kesav.SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.Select;

public class WebBrow {


    public static void main(String[] args) throws InterruptedException {
   
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http:google.com");
        driver.manage().window().maximize();
       // driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium Practice");;
    }
}
