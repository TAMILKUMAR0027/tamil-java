package com.expleo.java.selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Allpages {
public static void main(String[] args){

WebDriver d=new ChromeDriver();
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

try{

d.get("https://www.skyscanner.co.in/");

d.findElement(By.xpath("//span[text()='From']"));
d.findElement(By.xpath("//span[text()='Direct flights']/preceding-sibling::input"));
d.findElement(By.xpath("//button[contains(@data-testid,'desktop-cta')]"));
d.findElement(By.xpath("//span[@aria-current='page']"));
d.findElement(By.xpath("//span[text()='Flexible dates']/ancestor::button"));
d.findElement(By.xpath("//span[text()='View all deals']"));
d.findElement(By.xpath("//button[contains(@data-testid,'depart')]"));
d.findElement(By.xpath("//input[@aria-label='Direct flights']"));
d.findElement(By.id("originInput-input"));
d.findElement(By.id("destinationInput-input"));

d.get("https://www.skyscanner.co.in/hotels");

d.findElement(By.linkText("Hotels"));
d.findElement(By.partialLinkText("app"));
d.findElement(By.xpath("//span[text()='Add a hotel']/preceding-sibling::input"));
d.findElement(By.partialLinkText("Help"));
d.findElement(By.partialLinkText("cookie"));
d.findElement(By.id("header-logo-link"));
d.findElement(By.xpath("//span[text()='Salem']/ancestor::a"));

d.get("https://www.skyscanner.co.in/carhire");

d.findElement(By.xpath("//input[contains(@placeholder,'City')]"));
d.findElement(By.xpath("//img[@alt='Europcar']"));
d.findElement(By.id("carhire-search-controls-time-pick-up"));
d.findElement(By.xpath("//button[@data-backpack-ds-component='SelectableChip']/following-sibling::button[1]"));
d.findElement(By.xpath("//input[contains(@id,'location-pick-up')]"));
d.findElement(By.id("culture-info"));
d.findElement(By.id("pagewrap"));
d.findElement(By.id("airli"));
d.findElement(By.xpath("//a[@id='header-logo-link']//svg"));
d.findElement(By.tagName("title"));

}catch(Exception e){
System.out.println(e.getMessage());
}

d.quit();
}
}