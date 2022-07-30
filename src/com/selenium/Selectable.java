package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");

		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int size = selectable.size();
		System.out.println(size);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2)).build().perform();

		/*Actions action = new Actions(driver);
		action.clickAndHold(selectable.get(0));
		action.clickAndHold(selectable.get(1));
		action.clickAndHold(selectable.get(2)); 
		action.build().perform();*/
		

	}

}
