package com.SDET3_BlueStone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class senatio_1 {

	public static void main(String[] args) {
		
		//open browser
		WebDriver driver=new ChromeDriver();
		
		//Enter URL
		driver.get("https://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//Entering value in search tab
driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("rings");

//click on search btn
driver.findElement(By.xpath("//input[@value='Search']")).click();

//mouse over to price
driver.findElement(By.xpath("//section[@id='Price-form']"));
Actions ac=new Actions(driver);
WebElement ele=driver.findElement(By.xpath("//section[@id='Price-form']"));
ac.moveToElement(ele).build().perform();

//click on below 10k price
driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']")).click();

//count of below 10k
String text=driver.findElement(By.xpath("//div[@id='page-title']")).getText();
 System.out.println(text);
 
 //close browser
driver.close();
	}

}
