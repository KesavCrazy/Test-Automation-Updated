package com.kesav.SeleniumPrac;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com");
        
        driver.navigate().to("http://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
}
}
