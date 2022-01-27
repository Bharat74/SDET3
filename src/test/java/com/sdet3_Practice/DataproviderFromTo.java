package com.sdet3_Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Vtiger.genericUtil.ExcelUtil;

public class DataproviderFromTo {
	@Test(dataProvider= "getvalues")
	public void dataprovider(String s1,String s2)
	
	{
		System.out.println(s1+" "+s2);
	}
	
	@DataProvider
	
	public Object[][] getvalues() throws EncryptedDocumentException, IOException
	{
		ExcelUtil ex=new ExcelUtil();
		
		int lastrow=ex.getlastrow("Sheet3");
		
		Object[][] arr=new Object[lastrow+1][2];
		
		for(int i=0;i<=lastrow;i++)
		{
			arr[i][0]=ex.readExcelData("Sheet3", i, 0);
			arr[i][1]=ex.readExcelData("Sheet3", i, 1);
			//arr[i][2]=ex.readExcelData("Sheet3", i, 2);
		}
	     return arr;	
	}
	
	

}
