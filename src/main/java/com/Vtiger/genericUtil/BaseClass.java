package com.Vtiger.genericUtil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Vtiger.POMclass.HomePage;
import com.Vtiger.POMclass.LoginPage;

public class BaseClass
{
	public WebDriver driver;
	public LoginPage lp;
	public static WebDriver sdriver;
	@BeforeSuite
	public void setUp()
	{
		System.out.println("Connect to DB");
	}
	@BeforeClass
	public void LaunchBrowser_URL() throws IOException
	{
		String Browser=FileUtil.objectofFlieUtil().readdatfrompropfile("browser");
		if(Browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		
		driver.get(FileUtil.objectofFlieUtil().readdatfrompropfile("url"));
		
		//maximize & impwait
		WebDriverUtil Webutil=new WebDriverUtil(driver);
		Webutil.maximize();
		Webutil.pageloadtimeout();
		lp=new LoginPage(driver);
		sdriver=driver;
	}
		
		@BeforeMethod
	    public void logintoApp() throws IOException 
		{
	     lp.logintoapp();
		
	     }
		@AfterMethod
		public void logoutfromApp() throws InterruptedException
		{
			HomePage hp=new HomePage(driver);
			hp.signoutfromapp();
		    // hp.signoutfromapp();
		}
		@AfterClass(groups= {"smokeTest","RegressionTest"})
		public void teardown() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.close();
		}
		@AfterSuite(groups= {"smokeTest"})
		public void disconnectfromDB()
		{
			System.out.println("Disconnect from DB");
		}
		
		public static void takescreenshot(String name) throws IOException
		{
			File srcfile=((TakesScreenshot)sdriver).getScreenshotAs(OutputType.FILE);
			String destfile=System.getProperty("user.dir")+"/screenshot/"+name+".png";
			File finaldest=new File(destfile);
			FileUtils.copyFile(srcfile, finaldest);
			
		}
}