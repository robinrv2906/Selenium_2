package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String pw = driver.getWindowHandle();
		
		WebElement firstButton = driver.findElement(By.id("home"));
		firstButton.click();
		
		Set<String> allwind = driver.getWindowHandles();
		
		
		for (String new_Window : allwind) {		
				driver.switchTo().window(new_Window);
			}
		
		
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		edit.click();
		driver.close();
		
		driver.switchTo().window(pw);
		
		WebElement multipleWindow = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		multipleWindow.click();
		
		int size = driver.getWindowHandles().size();
		System.out.println("size of windows: "+size);
		
		WebElement dontCloseMe = driver.findElement(By.id("color"));
		dontCloseMe.click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for (String cp : allwindows) {
			if (!cp.equals(pw)) {
				driver.switchTo().window(cp);
				driver.close();
			}
		}
		
	
		
		
		
		
	}

}
