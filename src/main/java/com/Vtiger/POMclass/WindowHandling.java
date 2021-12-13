package com.Vtiger.POMclass;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("http://naukri.com");
	
	driver.manage().window().maximize();
	Set<String> allwhs=driver.getWindowHandles();
	 
	
	for(String wh:allwhs) {
		
	Set<String>	title=driver.getWindowHandles();
	System.out.println(title);
		 
	
	}
	
	}
	
	

}
