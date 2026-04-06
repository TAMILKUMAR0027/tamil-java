package com.expleo.java.selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.skyscanner.co.in/");
		WebElement k=d.findElement(By.xpath("//span[text()='From']"));
		System.out.println(k.getText());
		d.findElement(By.xpath("//span[text()='From']")).getText();
		d.findElement(By.xpath("//span[text()='Direct flights']/preceding-sibling::input")).getText();
		d.findElement(By.xpath("//button[contains(@data-testid,'desktop-cta')]")).getText();
		
		d.findElement(By.xpath("//span[text()='Flexible dates']/ancestor::button")).getText();
		d.findElement(By.xpath("//span[text()='View all deals']")).getText();
		d.findElement(By.xpath("//button[contains(@data-testid,'depart')]")).getText();
		d.findElement(By.xpath("//input[@aria-label='Direct flights']")).getText();
		d.findElement(By.id("originInput-input")).getText();
		d.quit();
	}

}
