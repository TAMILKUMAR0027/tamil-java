package com.expleo.java.selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		Actions act=new Actions(d);
		d.manage().window().maximize();
		d.get("https://omayo.blogspot.com/");
		WebElement click=d.findElement(By.cssSelector("button[ondblclick='dblclickAlert()']"));
		act.doubleClick(click).perform();
		
		}

}
