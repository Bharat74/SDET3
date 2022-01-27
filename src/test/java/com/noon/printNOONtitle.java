package com.noon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printNOONtitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.learnatnoon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement title = driver.findElement(By.xpath("((//*[local-name()='svg' and @width=\"150px\"])[last()-2]"));

		String Title=title.getText();
System.out.println(Title);
		driver.close();
	}

}
