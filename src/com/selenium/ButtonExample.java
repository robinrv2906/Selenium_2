package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//1.  go to home page
		WebElement goHomePage = driver.findElement(By.id("home"));
		goHomePage.click();
		
		driver.navigate().back();
		
		//2.  get the position
		WebElement getPositionButton = driver.findElement(By.id("position"));
		Point xypoint = getPositionButton.getLocation();
		int xValue = xypoint.getX();
		int yValue = xypoint.getY();
		System.out.println("x value is: "+xValue+"y value is: "+yValue);
		
		//3. find the color
		WebElement colorButton = driver.findElement(By.id("color"));
		String cssValue = colorButton.getCssValue("background-color");
		System.out.println(cssValue);
		
		//4. find the size
		WebElement sizeButton = driver.findElement(By.id("size"));
		 int height = sizeButton.getSize().getHeight();
		 int width = sizeButton.getSize().getWidth();
		 System.out.println("height is: "+height+"width is: "+width);
		 
	
			
	}

}
