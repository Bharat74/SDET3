package com.lenskart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitleoflenskart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		
		driver.get("https://www.lenskart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		String title=driver.findElement(By.xpath("//img[@alt=\"Lenskart\"]")).getAttribute("title");
        System.out.println(title);
        driver.close();
	}

}
