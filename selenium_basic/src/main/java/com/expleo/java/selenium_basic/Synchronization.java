package com.expleo.java.selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://omayo.blogspot.com/");
		d.findElement(By.cssSelector(".dropbtn")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//a[text()='Facebook']")).click();
	}

}
