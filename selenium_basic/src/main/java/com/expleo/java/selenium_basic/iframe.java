package com.expleo.java.selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoqa.com/frames");
		WebElement iframelement=d.findElement(By.id("frame1"));
		d.switchTo().frame(iframelement);
		String f1=d.findElement(By.id("sampleHeading")).getText();
		System.out.println(f1);
		d.switchTo().defaultContent();
		String mainpage=d.findElement(By.cssSelector("div[id=framesWrapper]")).getText();
		System.out.println("Back to main page : "+mainpage);
		d.switchTo().frame(1);
		String f2=d.findElement(By.id("sampleHeading")).getText();
		System.out.println("Switch by index :"+f2);
		d.quit();
	}

}
