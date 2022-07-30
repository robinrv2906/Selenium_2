package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		WebElement click1 = driver.findElement(By.id("Click"));
		click1.click();
		
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement click2 = driver.findElement(By.id("Click1"));
		click2.click();
		String text2 = driver.findElement(By.id("Click1")).getText();
		System.out.println(text2);
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalTags = driver.findElements(By.tagName("iframe"));
		int size = totalTags.size();
		System.out.println(size);

	}

}
