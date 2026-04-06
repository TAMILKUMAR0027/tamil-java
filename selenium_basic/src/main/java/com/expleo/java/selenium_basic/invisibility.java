package com.expleo.java.selenium_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class invisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://leafground.com/waits.xhtml;jsessionid=node0h7wbh8g62q71yppzcinw576n14507689.node0");
		d.findElement(By.cssSelector("button[id='j_idt87:j_idt92'] span[class='ui-button-text ui-c']")).click();
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(10));
		Boolean k=wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("button[id='j_idt87:j_idt90'] span[class='ui-button-text ui-c']")));
		if(k)
			System.out.println("hi");
	}

}
