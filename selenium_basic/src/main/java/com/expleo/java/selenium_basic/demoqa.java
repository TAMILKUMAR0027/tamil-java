package com.expleo.java.selenium_basic;

import java.time.Duration;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demoqa.com/browser-windows");
		String parent = d.getWindowHandle();
		System.out.println(parent);
		Set<String> totalWindows = d.getWindowHandles();
		System.out.println("Count of window: " + totalWindows.size());
		d.findElement(By.cssSelector("button[id=windowButton]")).click();
		Set<String> newtotalWindows = d.getWindowHandles();
		System.out.println("Count of the window; " + newtotalWindows.size());
		java.util.Iterator<String> iterator = newtotalWindows.iterator();
		String mainwindow = iterator.next();
		String child = iterator.next();
		System.out.println(mainwindow);
		System.out.println(child);
		d.switchTo().window(child);
		WebElement text = d.findElement(By.id("sampleHeading"));
		System.out.println("Child title :" + text.getText());
		d.close();
		d.switchTo().window(parent);
		System.out.println("Parent title: " + d.getTitle());
		d.quit();

	}

}
