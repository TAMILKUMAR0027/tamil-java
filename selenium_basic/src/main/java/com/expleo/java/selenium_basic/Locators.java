package com.expleo.java.selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#google_vignette");
		WebElement pass=d.findElement(By.xpath("//*[@id='post-body-299858861183690484']/div/form/div[1]/label[2]"));		
		d.quit();
	}

	

}
