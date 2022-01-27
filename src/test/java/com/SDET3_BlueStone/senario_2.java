package com.SDET3_BlueStone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class senario_2 {

	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();

		//enter URL
		driver.get("https://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		//Entering value in search tab
		driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("rings");

		//click on search button
		driver.findElement(By.xpath("//input[@value='Search']")).click();

		//mouse over to next delivery
		Actions ac=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//a[@title='Jewellery with Next Day Delivery']"));
		ac.moveToElement(ele).build().perform();

		//count of next day delivery
		String text=driver.findElement(By.xpath("//span[@data-p='next-day-delivery,m']")).getText();
		System.out.println(text);

		//close the browser
		driver.close();

	}

}
