package com.expleo.java.selenium_basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KeyActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://omayo.blogspot.com/");
		String parent=d.getWindowHandle();
		
		Actions act=new Actions(d);
		WebElement compound=d.findElement(By.linkText("compendiumdev"));
		act.keyDown(Keys.CONTROL).moveToElement(compound).click().keyUp(Keys.CONTROL).build().perform();
		Set<String> allwindows=d.getWindowHandles();
		for(String id:allwindows) {
			d.switchTo().window(id);
		}
		
		Thread.sleep(3000);
		System.out.println("Child window is "+allwindows);
		d.switchTo().window(parent);
		
		
	}

}
