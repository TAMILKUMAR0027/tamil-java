package com.expleo.java.selenium_basic;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicit {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(10));
		d.get("https://omayo.blogspot.com/");
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(10));
		WebElement time=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#timerButton")));
		
		time.click();
		WebElement k=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#alert2")));
		k.click();
	}
}