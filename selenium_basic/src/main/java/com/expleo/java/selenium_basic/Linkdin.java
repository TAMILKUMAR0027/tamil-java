package com.expleo.java.selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkdin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.linkedin.com/");
		d.findElement(By.cssSelector("a.nav__button-secondary")).click();
		d.findElement(By.cssSelector("div span.nsm7Bb-HzV7m-LgbsSe-BPrWId")).click();
		d.findElement(By.cssSelector("#username")).sendKeys("jeevapranesh.vrp@gmail.com");
		d.findElement(By.cssSelector("#password")).sendKeys("Jeeva@1101");
		d.findElement(By.cssSelector("#organic-div > form > div.login__form_action_container > button")).click();
		String k=d.getTitle();
		System.out.println(k);
		String g="https://www.linkedin.com/feed/";
		if(g.equals(k)) {
			System.out.println("Equal");
		}
	}

}
