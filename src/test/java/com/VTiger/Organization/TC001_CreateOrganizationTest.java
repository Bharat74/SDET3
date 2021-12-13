package com.VTiger.Organization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.POMclass.CreateOrganization;
import com.Vtiger.POMclass.HomePage;
import com.Vtiger.POMclass.LoginPage;
import com.Vtiger.POMclass.OrgInfoPage;
import com.Vtiger.genericUtil.BaseClass;
import com.Vtiger.genericUtil.ExcelUtil;
import com.Vtiger.genericUtil.JavaUtil;

public class TC001_CreateOrganizationTest extends BaseClass
{
	
	
		@Test(groups="smokeTest",retryAnalyzer=com.Vtiger.genericUtil.RetryAnalyzer.class)
		public void CreateOrg() throws Throwable
		{
			
			HomePage hp=new HomePage(driver);
			hp.getorglink().click();
		
			OrgInfoPage orginfo=new OrgInfoPage(driver);
			orginfo.getcreateorgimg().click();
			
			String orgname=JavaUtil.ObjectforJavaUtil().getFirstName()+JavaUtil.ObjectforJavaUtil().generateRandomNumber();
			
			CreateOrganization co=new CreateOrganization(driver);
			 OrgInfoPage oip=new OrgInfoPage(driver);
			oip.getOrgname().sendKeys(orgname);
			co.getsavebtn().click();
			
			driver.navigate().refresh();
			 hp.getorglink().click();
			 
			
			 oip.searchfororg(orgname, "Organization Name");
		
		//validation
			
		 WebElement add = driver.findElement(By.xpath("//a[@title='Organizations' and text()='"+orgname+"']")); 
			Assert.assertEquals(add.getText(), orgname);
		}

			
		
		@Test(retryAnalyzer=com.Vtiger.genericUtil.RetryAnalyzer.class)
		
		public void createorgwithphonenumber() throws InterruptedException
		{
			String orgname=JavaUtil.ObjectforJavaUtil().getFirstName()+JavaUtil.ObjectforJavaUtil();
			String phoneno=JavaUtil.ObjectforJavaUtil().getphonnumber()+JavaUtil.ObjectforJavaUtil();
			
		 
		//verification
		
		WebElement add = driver.findElement(By.xpath("//a[@title='Organizations' and text()='"+orgname+"']")); 
		 if(add.getText().equalsIgnoreCase(orgname))
		 {
				System.out.println("pass");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
		 HomePage hp=new HomePage(driver);
		    hp.signoutfromapp();
		    Thread.sleep(5000);
		    driver.close();

        }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//launch browser
       
		//maximize & impwait
		//WebDriverUtil Webutil=new WebDriverUtil(driver);
		//Webutil.maximize();
		//Webutil.pageloadtimeout();
		
		
		//login
		//LoginPage lp=new LoginPage(driver);
		//HomePage hp=new HomePage(driver);
		
		//CreateOrganization  og=new CreateOrganization (driver);
		//lp.logintoapp();
		
		//hp.getorglink().click();
		
		//og.getorgname().click();
		
		//String orgname=JavaUtil.ObjectforJavaUtil().getFirstName()+JavaUtil.ObjectforJavaUtil();
		
		//og.getorgname().sendKeys( orgname);
		
		//og.getsavebtn().click();
	
		  //driver.navigate().refresh();
		  
		//  hp.getorglink().click();
		  
		//  driver.navigate().refresh();
	//	WebElement val =driver.findElement(By.xpath("//a[@title='Organizations' and text()='orgname']"));
		//if(val.getText().equalsIgnoreCase(orgname))
		//{
		//	System.out.println("pass");
			
		//}
		//else {
		//	System.out.println("fail");
		
		//}
	
		//mouse over and sign out
		
		//WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		//Actions act=new Actions(driver);
		//act.moveToElement(ele).build().perform();
		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		 
		
		
	//}
//}
