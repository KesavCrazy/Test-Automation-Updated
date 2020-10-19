package com.kesav.SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.Select;

public class EnterValue {
    public static void main(String[] args) throws InterruptedException {
   
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://facebook.com");
        driver.manage().window().maximize();
       // driver.findElement(By.className("inputtext")).sendKeys("Kesav");
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");;
        driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("Kesav");
        driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("Raj");
        driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("9894543673");
        Select oSelect = new Select(driver.findElement(By.name("birthday_day")));
        oSelect.selectByVisibleText("19");
        Select oSelect1 = new Select(driver.findElement(By.name("birthday_month")));         
        oSelect1.selectByVisibleText("Jan");
        Select oSelect2 = new Select(driver.findElement(By.name("birthday_year")));         
        oSelect2.selectByVisibleText("1990");
        driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("eyfgewgt783764732");
        driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
      
    }
}
