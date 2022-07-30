package com.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropDown1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[6]/select"));
		Select select = new Select(dropDown1);
		select.selectByIndex(1);
		select.selectByValue("2");
		select.selectByVisibleText("UFT/QTP");
		
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		
		WebElement dropDown2 = driver.findElement(By.id("dropdown1"));
		dropDown2.sendKeys("Loadrunner");
	}
}
