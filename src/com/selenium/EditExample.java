package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("automation@gmail.com");
		
		WebElement append = driver.findElement(By.xpath("//input[@value='Append ']"));
		append.sendKeys(" Test");
		
		WebElement defaultValue = driver.findElement(By.name("username"));
		String attribute = defaultValue.getAttribute("value");
		System.out.println(attribute);
		
		WebElement clear = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clear.clear();
		
		WebElement enabled = driver.findElement(By.xpath("//input[@disabled='true']"));
		boolean enabled2 = enabled.isEnabled();
		System.out.println(enabled2);
	}

}
