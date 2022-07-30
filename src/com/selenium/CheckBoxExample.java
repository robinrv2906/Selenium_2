package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement java = driver.findElement(By.xpath("//*[@id='contentblock']/section/div/input[1]"));
		java.click();
		
		WebElement seleniumSelected = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
		boolean selected = seleniumSelected.isSelected();
		System.out.println(selected);
		
		WebElement option1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		if (option1.isSelected()) {
			option1.click();
		}
		
		WebElement option2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		if (option2.isSelected()) {
			option2.click();
		}
		
	}

}
