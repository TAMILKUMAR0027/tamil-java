package com.expleo.java.selenium_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Demoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.get("https://www.demoblaze.com/");
		d.findElement(By.cssSelector("a[id=login2]")).click();
		WebElement k=d.findElement(By.cssSelector("input[id=loginusername]"));
		k.sendKeys("TamilKumar");
		WebElement pass=d.findElement(By.cssSelector("input[id=loginpassword]"));
		pass.sendKeys("Kiot1234");
		d.findElement(By.xpath("//button[text()='Log in']")).click();
		String username=d.findElement(By.cssSelector("a[id=nameofuser]")).getText();
		System.out.println(username);
	}

}
