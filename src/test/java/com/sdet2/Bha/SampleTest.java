package com.sdet2.Bha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void comandlineparameter()
	{
		WebDriver driver;
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		System.out.println("browser");
		System.out.println("url");
		
		if(browser.equalsIgnoreCase("firefox"))   //from base class
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver.get(url);
		
	}

}
