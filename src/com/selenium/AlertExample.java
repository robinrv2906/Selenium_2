package com.selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alertBox = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		alertBox.click();
		
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
		WebElement cofirmBox = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		cofirmBox.click();
		
		Alert confirmAlert=driver.switchTo().alert();
		confirmAlert.dismiss();
		
		WebElement prombtBox = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		prombtBox.click();
		
		Alert prombtAlert=driver.switchTo().alert();
		prombtAlert.sendKeys("Automation");
		prombtAlert.accept();
	}
}
