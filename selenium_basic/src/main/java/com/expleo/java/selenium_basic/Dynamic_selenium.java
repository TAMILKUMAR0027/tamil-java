package com.expleo.java.selenium_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.selenium.dev/selenium/web/dynamic.html");
		d.findElement(By.cssSelector("input#adder")).click();
		WebElement k=d.findElement(By.cssSelector("div[id=box0]"));
		System.out.println(k.getCssValue("background-color")); 
	}

}
