package com.expleo.java.selenium_basic;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.*;
public class FlipkartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String st="https://www.flipkart.com/";
		System.out.println("Page title : "+driver.getTitle()+" Length of the title :"+driver.getTitle().length());
		if(driver.getCurrentUrl().equals(st)) {
			System.out.println("Url is crt");
		}else {
			System.out.println("Fail");
		}
		System.out.println(driver.getPageSource());
		System.out.println(driver.getPageSource().length());
		
	}

}
