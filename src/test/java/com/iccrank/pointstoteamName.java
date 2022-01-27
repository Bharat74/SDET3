package com.iccrank;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pointstoteamName {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String teamname=" New Zealand";
		List<WebElement> teamName=driver.findElements(By.xpath("//tr[*]/td[2]/span[@class='u-hide-phablet']"));

for(int i=1;i<teamName.size();i++) {
	if(teamName.get(i).getText().equalsIgnoreCase(teamname)) {
		System.out.println(driver.findElement(By.xpath("//span[.='"+teamname+"']/parent::td/parent::tr/td[2]")).getText());
	driver.close();
	}
}
	
	}

}
