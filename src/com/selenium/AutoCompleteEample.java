package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteEample {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("s");
		
		Thread.sleep(4000);
		
		List<WebElement> optionsList = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		System.out.println(optionsList.size());
		
		for (WebElement webElement : optionsList) {
			if (webElement.getText().equals("Selenium")) {
				webElement.click();
				System.out.println("if part");
				break;
			}
			else {
				System.out.println("else part");
			}
			
		}
		

	}

}
