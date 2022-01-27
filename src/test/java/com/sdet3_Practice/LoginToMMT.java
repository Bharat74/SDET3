package com.sdet3_Practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Vtiger.genericUtil.JavaUtil;

public class LoginToMMT {

	@Test(dataProvider="getData")
	public void logintommt(String src,String dest) throws InterruptedException
	{
		System.out.println(src+" "+dest);
		
		JavaUtil ju=new JavaUtil();
		ju.getcurrentdate();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();


		//clickon popup
		driver.findElement(By.xpath("//li[@data-cy=\"account\"]")).click();
		//long popup
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();

		//click on from
		driver.findElement(By.xpath("//span[text()='From']"));
		//write from
		driver.findElement(By.xpath("//label[@for='fromCity']")).sendKeys(src);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='"+src+"']")).click();
		//write to
		driver.findElement(By.xpath("//label[@for='toCity']")).sendKeys(dest);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='"+dest+"']")).click();
		//click on departure
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();

		Thread.sleep(2000);
		
		//enter date
		for (int i=0;i<11;i++)
		{
			try {
				driver.findElement(By.xpath("//div[@aria-label=\"Tue Dec 21 2021\"]")).click();
				break;

			} catch (Exception e) {
				driver.findElement(By.xpath("//div[@aria-label='Next Month']")).click();	
			}


		}
	}

		
		@DataProvider
		
		public Object getData() {
			
			Object arr[][]=new Object[3][2];
			arr[0][0]="HYB";
		    arr[0][1]="DEL";
				
		    arr[1][0]="BOM";
		    arr[1][1]="VGA";
		    
		    arr[2][0]="HYB";
		    arr[2][1]="VGA";
		  
		    return arr;
		}
	}

