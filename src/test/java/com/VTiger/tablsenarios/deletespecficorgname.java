package com.VTiger.tablsenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deletespecficorgname {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("12345");
driver.findElement(By.id("submitButton")).click();
driver.findElement(By.xpath("//a[@href=\"index.php?module=Accounts&action=index\"]")).click();

driver.findElement(By.name("search_text")).sendKeys("SDET2");

driver.findElement(By.id("bas_searchfield"));
driver.findElement(By.xpath("//input[@value='2']")).click();
	}

}
