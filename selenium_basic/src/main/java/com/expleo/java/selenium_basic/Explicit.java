package com.expleo.java.selenium_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(10));
		d.get("https://omayo.blogspot.com/");
	
		
		WebElement k=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#alert2")));
		k.click();
	}

}
