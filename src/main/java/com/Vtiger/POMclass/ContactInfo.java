package com.Vtiger.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.genericUtil.WebDriverUtil;

public class ContactInfo {
	
	WebDriver driver;
	
	@FindBy(name="search_text")
	private WebElement searchforContact;
	
	@FindBy(id="bas_searchfield")
	private WebElement inDD;
	
	@FindBy(name="submit")
	private WebElement searchbtn;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
    private WebElement createcontactimg;
	
	public WebElement getsearchforContact()
	{
		return searchforContact;
	}
	public WebElement getinDD()
	{
		return inDD;
	}
	public WebElement getsearchbtn()
	{
		return  searchbtn;
	}
	public WebElement getcreatecontactimg()
	{
		return createcontactimg;
	}
	
	public ContactInfo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
public void searchforContact(String contactinfo,String text)
{
	searchforContact.sendKeys(contactinfo);
	WebDriverUtil Webutil=new WebDriverUtil(driver);
	 Webutil.selectvaluefromDD(text, inDD);
	 searchbtn.click();
	 createcontactimg.click();
}

}
