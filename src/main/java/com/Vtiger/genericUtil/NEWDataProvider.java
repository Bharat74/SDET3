package com.Vtiger.genericUtil;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NEWDataProvider {
	
	@Test(dataProvider="getvalue")
	public void print(String value1, String value2)
	{
		System.out.println(value1+" "+value2);
	}

	@DataProvider()
	public Object[] [] getvalue()
	{
		Object arr[] []=new Object[4] [2];
		
		arr[0][0]="TYSS";
		arr[0][1]="HYD";
		
		arr[1][0]="QSP";
		arr[1][1]="KPHB";
		
		arr[2][0]="JSP";
		arr[2][1]="JNTU";
		
		arr[3][0]="PYSP";
		arr[3][1]="NOIDA";
		
		return arr;
	}
}
