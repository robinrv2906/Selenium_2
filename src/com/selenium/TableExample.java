package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columnCount = columns.size();
		System.out.println("Number of Columns "+columnCount);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println("Number of Rows "+rowCount);
		
		List<WebElement> getPercent = driver.findElements(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		for (WebElement webElement : getPercent) {
			String percent = webElement.getText();
			System.out.println(percent);
		}
		
		List<WebElement> alldata = driver.findElements(By.xpath("//td[2]"));
		List<Integer> numberList= new ArrayList<Integer>();
		for (WebElement webElement : alldata) {
			String text = webElement.getText().replace("%", "");
			numberList.add(Integer.parseInt(text));
		}
		Integer smallValue = Collections.min(numberList);
		String smallValueString = Integer.toString(smallValue);
		
		String finalXpath="//td[normalize-space()="+"'"+smallValueString+"%']"+"//following::td[1]";
		System.out.println(finalXpath);
		WebElement check = driver.findElement(By.xpath(finalXpath));
		check.click();
	}
}
