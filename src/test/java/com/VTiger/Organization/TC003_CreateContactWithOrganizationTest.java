package com.VTiger.Organization;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.POMclass.ContactInfo;
import com.Vtiger.POMclass.createContact;
import com.Vtiger.genericUtil.BaseClass;
import com.Vtiger.genericUtil.ExcelUtil;
import com.Vtiger.genericUtil.JavaUtil;

public class TC003_CreateContactWithOrganizationTest extends BaseClass
{
	@Test(groups="smokeTest",retryAnalyzer=com.Vtiger.genericUtil.RetryAnalyzer.class)
	public void CreateContactsmoke(ExcelUtil ex) throws Throwable, IOException
	{
		String lname=JavaUtil.ObjectforJavaUtil().getLastName();
		ExcelUtil.objectofExcelUtil();
		createContact cc=new createContact(driver);
		cc.createContact(lname);
		ContactInfo cp=new ContactInfo(driver);
		cp.searchforContact(lname, ex.readExcelData("shet2",0,1));
		
		WebElement add=driver.findElement(By.xpath("//a[text()='Contacts' and text()='"+lname+"']"));
		Assert.assertEquals(add.getText(), lname);
		System.out.println("TC003 is pass");
		
		
}
	@Test (groups="RegressionTest",retryAnalyzer=com.Vtiger.genericUtil.RetryAnalyzer.class)
	 public void CreateContactwithorg()
	 {
		String fname=JavaUtil.ObjectforJavaUtil().getFirstName();
		String lname=JavaUtil.ObjectforJavaUtil().getLastName();
		ExcelUtil ex=ExcelUtil.objectofExcelUtil();      
		
		createContact cc= new createContact(driver);
		cc.createContact(lname);
		
	 }
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//public static WebDriver driver;

//	public static void main(String[] args) throws InterruptedException, IOException {
//		
//		String Browser=FileUtil.objectofFlieUtil().readdatfrompropfile("browser");
//		
//		if(Browser.equalsIgnoreCase("firefox"))
//		{
//			driver=new FirefoxDriver();
//		}
//		else if(Browser.equalsIgnoreCase("edge"))
//		{
//			driver=new EdgeDriver();
//		}
//		else
//		{
//			driver=new ChromeDriver();
//		}
//		
//		String url=FileUtil.objectofFlieUtil().readdatfrompropfile("url");
//		driver.get(url);	
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
		//login
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("12345");
//		driver.findElement(By.id("submitButton")).click();
//
//		//create contact
//		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
//		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		
	
