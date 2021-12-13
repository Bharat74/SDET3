package com.sdet2.Bha;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_data {

	public static void main(String[] args) throws IOException {
		String dirpath=System.getProperty("user.dir");
		String propfilepath=dirpath+"/commondata.xlsx";
		
		FileInputStream fis=new FileInputStream(propfilepath);
	Workbook workbook =WorkbookFactory.create(fis);
	Sheet sheet =workbook.getSheet("sheet1");
	
	Row row = sheet.getRow(1);
	
	String value = row.getCell(1).getStringCellValue();
	
	 int a=Integer.parseInt(value);
	
	System.out.println(a);


	}

}
