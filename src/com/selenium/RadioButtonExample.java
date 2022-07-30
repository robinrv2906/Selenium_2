package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement unchecked = driver.findElement(By.xpath("(//input[@name='news'])[1]"));
		WebElement checked = driver.findElement(By.xpath("(//input[@name='news'])[2]"));
		boolean status1 = unchecked.isSelected();
		boolean status2 = checked.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement below20 = driver.findElement(By.name("age"));
		below20.click();
		
		
	}

}
