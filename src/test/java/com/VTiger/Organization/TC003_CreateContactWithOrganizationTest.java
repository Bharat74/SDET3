package com.VTiger.Organization;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.POMclass.ContactInfo;
import com.Vtiger.POMclass.HomePage;
import com.Vtiger.POMclass.PopupwindowofCC;
import com.Vtiger.POMclass.createContact;
import com.Vtiger.genericUtil.BaseClass;
import com.Vtiger.genericUtil.ExcelUtil;
import com.Vtiger.genericUtil.JavaUtil;
import com.Vtiger.genericUtil.WebDriverUtil;

public class TC003_CreateContactWithOrganizationTest extends BaseClass {
	@Test(groups = "smokeTesting", retryAnalyzer = com.Vtiger.genericUtil.RetryAnalyzer.class)
	public void CreateContactsmoke() throws Throwable, IOException {

		HomePage hp = new HomePage(driver);
		hp.getContactslink().click();

		ContactInfo coi = new ContactInfo(driver);
		coi.getcreatecontactimg().click();

		createContact cc = new createContact(driver);
		String lname = JavaUtil.ObjectforJavaUtil().getLastName()+JavaUtil.ObjectforJavaUtil().generateRandomNumber();
		cc.getlnameEnter().sendKeys("lname");

		cc.getcreateimg().click();
		WebDriverUtil webutil = new WebDriverUtil(driver);
		webutil.switchtowindow("contact");
		
		PopupwindowofCC popup=new PopupwindowofCC(driver);
		popup.getsearchorgname().sendKeys("SDET3");
		
		popup.getsearchbtn().click();
		
		popup.getSelectorg().click();
		
		webutil.switchtowindow("Administrator");
		
		cc.getsavebtn().click();

	}

	//	@Test(groups = "RegressionTesting", retryAnalyzer = com.Vtiger.genericUtil.RetryAnalyzer.class)
	//	public void CreateContactwithorg() {
	//		String fname = JavaUtil.ObjectforJavaUtil().getFirstName();
	//		String lname = JavaUtil.ObjectforJavaUtil().getLastName();
	//		ExcelUtil ex = ExcelUtil.objectofExcelUtil();
	//
	//		createContact cc = new createContact(driver);
	//		cc.createContact(lname);
	//
	//	}
}

// public static WebDriver driver;

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
// login
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("12345");
//		driver.findElement(By.id("submitButton")).click();
//
//		//create contact
//		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
//		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
