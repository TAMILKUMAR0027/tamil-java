package com.expleo.java.selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.*;

public class AppTest {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com.in");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Selenium",Keys.ENTER);
		System.out.println("Page title is : "+driver.getTitle());
		driver.close();
		

	}

}