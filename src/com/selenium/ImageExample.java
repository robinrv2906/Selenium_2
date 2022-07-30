package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");

		WebElement firstImage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		firstImage.click();
		
		WebElement img = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a"));
		img.click();
		
		WebElement brokenImage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		if (brokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("image is broken");
			
		}else  {
			System.out.println("image is not broken");
		}
	}

}
