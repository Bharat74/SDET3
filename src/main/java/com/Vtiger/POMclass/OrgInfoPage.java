package com.Vtiger.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.genericUtil.WebDriverUtil;

public class OrgInfoPage //rule1
{
	WebDriver driver;
	
	@FindBy(xpath="//img[@title='Create Organization...']")   //rule2
	private WebElement createorgimg;  //rule3
	
	@FindBy(name="search_text")       //rule2
	private WebElement searchfororgtxtfld;   //rule3
	
	@FindBy(xpath="//input[@name=\"accountname\"]")
	private WebElement orgname;
	
	public WebElement getOrgname() {
		return orgname;
	}
	@FindBy(id="bas_searchfield")    //rule2
	private WebElement searchforDD;  //rule3
	
	@FindBy(name="submit")         //rule2
	private WebElement searchnowbtn;//rule3
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement clickplusymbol;
	
public WebElement getcreateorgimg() //rule4
{
	return createorgimg;
}
public WebElement getsearchfororgtxtfld()  //rule4
{
	return searchfororgtxtfld;
}
public WebElement getsearchforDD()   //rule4
{
	return searchforDD;
}
public WebElement getsearchnowbtn()  //rule4
{
	return searchnowbtn;
}
public WebElement getclickplusymbol()
{
	return  clickplusymbol;
}
public OrgInfoPage(WebDriver driver)   //rule5
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void searchfororg(String orgnamesearchfor,String text) //rule6
{
	searchfororgtxtfld.sendKeys( orgnamesearchfor);
	WebDriverUtil Webutil=new WebDriverUtil(driver);
	Webutil.selectvaluefromDD(text,searchforDD);
	searchnowbtn.click();
	
}

}
