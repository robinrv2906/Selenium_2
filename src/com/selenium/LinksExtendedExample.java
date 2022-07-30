package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExtendedExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement homepage= driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		
		driver.navigate().back();
		
		WebElement whereToGo = driver.findElement(By.partialLinkText("Find where"));
		String link = whereToGo.getAttribute("href");
		System.out.println("link is going to: "+link);
		
		WebElement brokenLink = driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();
		
		String title = driver.getTitle();
		
		if (title.contains("404")) {
			System.out.println("Link is Broken");
		}
		
		driver.navigate().back();
		
		WebElement homepage1= driver.findElement(By.linkText("Go to Home Page"));
		homepage1.click();
		
		driver.navigate().back();
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int size = totalLinks.size();
		System.out.println("total number link is: "+size);
		

	}

}
