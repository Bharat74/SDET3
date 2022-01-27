package com.lenskart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class trendingsearch {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.lenskart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type='text']")).click();

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='trending_block']/ul/li"));

		for(WebElement title:list) 
	
		{
			System.out.println(title.getText());

		}
		driver.close();
	}
}
