package com.Vtiger.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.genericUtil.WebDriverUtil;

public class PopupwindowofCC {
	
	WebDriver driver;
	
	@FindBy (xpath="//a[@id='1']")
	private WebElement selectorg;
	
	public WebElement getSelectorg() {
		return selectorg;
	}

	@FindBy(name="search_text")
	private WebElement searchorgname;
	
	@FindBy(name="search_field")
	private WebElement orgnameDD;
	
	@FindBy(name="search")
	private WebElement searchbtn;
	
	public WebElement getsearchorgname()
	{
		return searchorgname;
	}
	public WebElement getorgnameDD()
	{
		return  orgnameDD;
	}
	public WebElement getsearchbtn()
	{
		return searchbtn;
	}
    public PopupwindowofCC(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void validateorgname(String orgname,String text)
    {
    	searchorgname.sendKeys(orgname);
    	WebDriverUtil Webutil=new WebDriverUtil(driver);
    	 Webutil.selectvaluefromDD(text, orgnameDD);
    	 searchbtn.click();
    }
}
