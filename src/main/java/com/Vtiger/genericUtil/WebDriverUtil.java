package com.Vtiger.genericUtil;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtil {
	
	WebDriver driver;
	
public WebDriverUtil(WebDriver driver)
{
	this.driver=driver;
}

public void maximize()
{
driver.manage().window().maximize();	
}
public void pageloadtimeout()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
public void selectvaluefromDD(WebElement element,String value)
{
	Select select=new Select(element);
	select.selectByValue(value);
}
public void selectvalufromDD(WebElement element,int index)
{
	Select select=new Select(element);
	select.selectByIndex(index);
}
public void selectvaluefromDD(String text,WebElement element)
{
Select select=new Select(element);
select.selectByVisibleText(text);
}
public void movetoelement(WebElement element) 
{
	Actions act=new Actions(driver);
	act.moveToElement(element).build().perform();
}
public void clickbyoffset(int xoffset,int yoffset)
{
	Actions act=new Actions(driver);
	act.moveByOffset(xoffset, yoffset).build().perform();
}
public void rightclick()
{
	Actions act=new Actions(driver);
	act.contextClick();
}

public void rightclick(WebElement element)
{
	Actions act=new Actions(driver);
	act.contextClick(element);
}
public void switchtoframe(int index) 
{
	driver.switchTo().frame(index);
}
public void acceptAlert()
{
	driver.switchTo().alert().accept();
}
public void dismissAlert()
{
	driver.switchTo().alert().dismiss();
}
public void sendkeys(WebElement element,String keystosend)
{
	element.sendKeys(keystosend);
}
public void scrolltoelement(WebElement element)
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollintoview():", element);
}
public void scrollbyposition(int x,int y)
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrooBy("+x+","+y+")");
}
public void switchtowindow(String title)
{
	Set<String>winds=driver.getWindowHandles();
	for(String id:winds)
	{
		String actualtitle=driver.switchTo().window(id).getTitle();
		System.out.println(actualtitle);
		if(actualtitle.equalsIgnoreCase(title))
		{
			break;
		}
		}
}

}
