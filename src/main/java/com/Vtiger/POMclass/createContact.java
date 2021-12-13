package com.Vtiger.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.genericUtil.WebDriverUtil;

public class createContact {
	
	WebDriver driver;
	
	@FindBy(name="salutationtype")
	private WebElement saluDD;
	
	@FindBy(name="firstname")
	private WebElement fnameEnter;
	
	@FindBy(name="lastname")
	private WebElement lnameEnter;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement createimg;
	
	public WebElement getsaluDD()
	{
		return saluDD;
	}
	public WebElement getfnameEnter()
	{
		return fnameEnter;
	}
	public WebElement getlnameEnter()
	{
		return lnameEnter;
	}
	public WebElement getsavebtn()
	{
		return  savebtn;
	}
	public WebElement getcreateimg()
	{
		return  createimg;
	}
	
	public createContact(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void saveContact(String createcontact,String text)
	{
		fnameEnter.sendKeys(createcontact);
	    lnameEnter.sendKeys(createcontact);
		WebDriverUtil Webutil=new WebDriverUtil(driver);
		Webutil.selectvaluefromDD(text, saluDD);
		savebtn.click();
		createimg.click();
	}
	public void getcreateimg(String lname) {
		// TODO Auto-generated method stub
		
	}
	public void createContact(String lname) {
		// TODO Auto-generated method stub
		
	}
	
}
