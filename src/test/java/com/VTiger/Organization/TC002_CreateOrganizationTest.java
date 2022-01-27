package com.VTiger.Organization;

import java.io.IOException;

import org.apache.commons.io.HexDump;
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

import com.Vtiger.POMclass.CreateOrganization;
import com.Vtiger.POMclass.HomePage;
import com.Vtiger.POMclass.LoginPage;
import com.Vtiger.POMclass.OrgInfoPage;
import com.Vtiger.genericUtil.BaseClass;
import com.Vtiger.genericUtil.ExcelUtil;
import com.Vtiger.genericUtil.FileUtil;
import com.Vtiger.genericUtil.JavaUtil;
import com.Vtiger.genericUtil.WebDriverUtil;

public class TC002_CreateOrganizationTest extends BaseClass
{
	@Test
	//(retryAnalyzer=com.Vtiger.genericUtil.RetryAnalyzer.class)
	public void CreateOrg() throws Throwable, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.getOrglink().click();
		String orgname1=JavaUtil.ObjectforJavaUtil().getFirstName()+JavaUtil.ObjectforJavaUtil().generateRandomNumber();
		OrgInfoPage orginfo=new OrgInfoPage(driver);
		
		orginfo.getcreateorgimg().click();
	
		
		CreateOrganization cop=new CreateOrganization(driver);
		cop.d(orgname1, "Construction", "Active", "Customer");
		cop.getsavebtn();
		
		
		Thread.sleep(3000);
	//	driver.navigate().refresh();
		//orginfo.getcreateorgimg().click();
		hp.getOrglink().click();

		orginfo.searchfororg(orgname1, "Organization Name");
		WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		 

		
		
		
		
		
		
		
		
		
		
		
		//		ExcelUtil ex=ExcelUtil.objectofExcelUtil();
//		
//		CreateOrganization cop=new CreateOrganization(driver);
//		cop.createorgnameWithDD(orgname, ex.readExcelData("Sheet1", 5, 0), ex.readExcelData("Sheet1", 1, 1), ex.readExcelData("Sheet1", 2, 3));
//		Thread.sleep(3000);
//		
//		OrgInfoPage orgp=new OrgInfoPage(driver);
//	orgp.searchfororg(orgname, ExcelUtil.objectofExcelUtil().readExcelData(orgname, 0, 0));
//	
//	 WebElement add = driver.findElement(By.xpath("//a[@title='Organizations' and text()='"+orgname+"']")); 
//		Assert.assertEquals(add.getText(), orgname);
//		System.out.println("TC002 is pass");
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static WebDriver driver;
//
//	public static void main(String[] args) throws IOException, InterruptedException {
//	
//		String Browser=FileUtil.objectofFlieUtil().readdatfrompropfile("browser");
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
//		driver.get(FileUtil.objectofFlieUtil().readdatfrompropfile("url"));
//		
//		//maximize & impwait
//				WebDriverUtil Webutil=new WebDriverUtil(driver);
//				Webutil.maximize();
//				Webutil.pageloadtimeout();
//				
//		//login
//		LoginPage lp= new LoginPage(driver);
//		lp.logintoapp();
//		
//		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
//		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
//		
//		String orgname=JavaUtil.ObjectforJavaUtil().getFirstName();
//		driver.findElement(By.name("accountname")).sendKeys(orgname);
//       //industry drop down
//		WebElement dd1=driver.findElement(By.name("industry"));
//		Select select1=new Select(dd1);
//		select1.selectByVisibleText("Construction");
//		 
//		//rating drop down
//		WebElement dd2=driver.findElement(By.name("rating"));
//		Select select2=new Select(dd2);
//		select2.selectByValue("Active");
//		  
//		//type drop down
//		WebElement dd3=driver.findElement(By.name("accounttype"));
//		Select select3=new Select(dd3);
//		select3.selectByValue("Customer");
//		
//		//click on save button
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		driver.navigate().refresh();
//		
//		//validating created organization
//		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
//		driver.findElement(By.name("search_text")).sendKeys(orgname);
//		
//		WebElement dd=driver.findElement(By.id("bas_searchfield"));
//	    Select select=new Select(dd);
//		select.selectByVisibleText("Organization Name");
//		driver.findElement(By.name("submit")).click();
//		
//		WebElement val =driver.findElement(By.xpath("//a[@title='Organizations' and text()='orgname']"));
//		if(val.getText().equalsIgnoreCase(orgname))
//		{
//			System.out.println("pass");
//			
//		}
//		else {
//			System.out.println("fail");
//		
//		}
//		
//		driver.navigate().refresh();
//		
//		//mouse over and sign out
//		HomePage hp=new HomePage(driver);
//	    hp.signoutfromapp();
//	    Thread.sleep(5000);
//	    driver.close();
//		 
//	}
//
//}
