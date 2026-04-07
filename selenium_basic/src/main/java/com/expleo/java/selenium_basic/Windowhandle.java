package com.expleo.java.selenium_basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://leafground.com/window.xhtml");
		
		String parent=d.getWindowHandle();
		d.findElement(By.cssSelector("button[id='j_idt88:new'] span[class='ui-button-text ui-c']")).click();
		String title=d.getTitle();
		Set<String>allwindowhandle=d.getWindowHandles();
		System.out.println(allwindowhandle.size());
		
		for(String i:allwindowhandle) {
			if(title.equals(d.getTitle()))
				d.switchTo().window(parent);
		}
		
	}

}
