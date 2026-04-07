package com.expleo.java.selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		Actions act=new Actions(d);
		d.get("https://omayo.blogspot.com/");
		WebElement menu=d.findElement(By.id("blogsmenu"));
		act.moveToElement(menu).perform();
		String parent=d.getWindowHandle();
		WebElement option2=d.findElement(By.xpath("//span[text()='SeleniumByArun']"));
		act.moveToElement(option2).click().build().perform();
		d.switchTo().window(parent);
		d.quit();
		
	}

}
