package com.expleo.java.selenium_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.selenium.dev/selenium/web/dynamic.html");
		d.findElement(By.cssSelector("#reveal")).click();
		WebElement k=d.findElement(By.cssSelector("#revealed"));
		k.sendKeys("Tamil");
		System.out.println(k.getAttribute("value"));
	}

}
