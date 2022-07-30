package com.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		WebElement downloadLink = driver.findElement(By.linkText("Download Excel"));
		downloadLink.click();

		Thread.sleep(3000);
		//C:\Users\ELCOT\Downloads
		File fileLocation = new File("C:\\Users\\ELCOT\\Downloads");
		File[] files = fileLocation.listFiles();
		for (File file : files) {
			if (file.getName().equals("teatleaf.xlsx")) {
				System.out.println("File is downloaded");
				break;
			}
			
		}
		
		

	}

}
