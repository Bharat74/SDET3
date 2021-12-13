package com.Vtiger.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.genericUtil.WebDriverUtil;

public class HomePage   //rule1 login
{
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Organizations']")//rule2 
	private WebElement orglink; //rule3 
	
	@FindBy(xpath="//a[text()='Contacts']")//rule2
	private WebElement contactslink; //rule3
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")//rule 2
	private WebElement signoutimg;//rule3
	
	@FindBy(xpath="//a[text()='Sign Out']") //rule2
	private WebElement signoutlink;      //rule3
	
	public WebElement getorglink()        //rule4
	{
		return orglink; 
	}
	
	public WebElement getcontactslink()   //rule4
	{
		return contactslink; 
	}
	
	public  HomePage (WebDriver driver)   //rule5
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void signoutfromapp() throws InterruptedException //rule6
	{
		WebDriverUtil webutil=new WebDriverUtil(driver);
		webutil.movetoelement(signoutimg);
		Thread.sleep(5000);
		signoutlink.click();
		
	}
	
	
	

}
