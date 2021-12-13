package com.Vtiger.POMclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.genericUtil.FileUtil;

public class LoginPage      //Rule 1 login
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='user_name']")    //Rule2 Declaration
	private WebElement username;  //Rule3 initialization
	
	@FindBy(name="user_password")     //Rule2 Declaration
    private WebElement password;      //Rule3 initialization
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	
	public WebElement getUsername()   //rule4 usability
	{
		return username;
	}
	
	public WebElement getPassword()   //rule4 usability
	{
		return password;
	}
	
	public WebElement getloginbtn()   //rule4 usability
	{
		return loginbtn;
	}
	
	public LoginPage(WebDriver driver) //Rule5 constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logintoapp() throws IOException //rule6 BusinessLogic
	{
		 username.sendKeys(FileUtil.objectofFlieUtil().readdatfrompropfile("username"));
		 password.sendKeys(FileUtil.objectofFlieUtil().readdatfrompropfile("password"));
		 loginbtn.click();
	}
	
	//login credentials for user
	public void logintoapp(String newuesrname,String newpassword)
	{
		 username.sendKeys(newuesrname);
		 password.sendKeys(newpassword);
		 loginbtn.click();
	}
	

	
}
