package com.expleo.java.selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.google.com");
		Thread.sleep(5000);
		d.navigate().to("https://www.smartcliff.in");
		Thread.sleep(5000);
		d.navigate().back();
		Thread.sleep(5000);
		d.navigate().forward();
		Thread.sleep(5000);
		d.navigate().refresh();
		d.quit();
	}

}
