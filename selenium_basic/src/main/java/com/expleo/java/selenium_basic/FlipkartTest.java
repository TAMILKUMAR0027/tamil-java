package com.expleo.java.selenium_basic;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.*;
public class FlipkartTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver d=new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		String st="https://www.flipkart.com/";
		System.out.println("Page title : "+d.getTitle()+" Length of the title :"+d.getTitle().length());
		if(d.getCurrentUrl().equals(st)) {
			System.out.println("Url is crt");
		}else {
			System.out.println("Fail");
		}
		System.out.println(d.getPageSource());
		System.out.println(d.getPageSource().length());
		d.quit();
		
	}

}
