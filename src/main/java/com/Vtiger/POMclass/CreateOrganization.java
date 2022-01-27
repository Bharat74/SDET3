package com.Vtiger.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.genericUtil.WebDriverUtil;

public class CreateOrganization {

	WebDriver driver;
	
	@FindBy(name="accountname")
	private WebElement orgname;
	
	@FindBy (name="industry")
	private WebElement industryDD;
	
	@FindBy(name="rating")
	private WebElement ratingDD;
	
	@FindBy(name="accounttype")
	private WebElement typeDD;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	@FindBy(id="phone")
	private WebElement phoneNo;
	
	public WebElement getPhoneNo() {
		return phoneNo;
	}
	public WebElement getorgname()
	{
		return orgname;
	}
	public WebElement getindustryDD()
	{
		return industryDD;
	}
	public WebElement getratingDD()
	{
		return ratingDD;
	}
	public WebElement gettypeDD()
	{
		return typeDD;
	}
	public WebElement getsavebtn()
	{
		return savebtn;
	}
	public  CreateOrganization(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void createOrgWithContact(String orgname1)
	{
		orgname.sendKeys(orgname1);
	}
	
	
//	public void createOrgWithContact(String name,String phone)
//	{
//		orgname.sendKeys(name);
//		phoneNo.sendKeys(phone);
//		savebtn.click();
//	}
	
	public void d(String orgname1, String industry, String rating, String type)
	{
		orgname.sendKeys(orgname1);
		WebDriverUtil Webutil=new WebDriverUtil(driver);
		Webutil.selectvaluefromDD(industry,getindustryDD());
		Webutil.selectvaluefromDD(rating,getratingDD());
		Webutil.selectvaluefromDD(type,gettypeDD());
		savebtn.click();
	}
	
}
