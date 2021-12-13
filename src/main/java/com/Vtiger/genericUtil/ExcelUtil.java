package com.Vtiger.genericUtil;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtil {
	
	public  ExcelUtil(){
		
	}
	public static ExcelUtil objectofExcelUtil() {
		 ExcelUtil ex=new  ExcelUtil();
		 return ex;
		
	}
	public int getlastrow(String string) throws EncryptedDocumentException, IOException{
		
		
    FileInputStream fis=new FileInputStream(IAutoConstants.Excelpath);
	Workbook workbook =WorkbookFactory.create(fis);
	Sheet sheet =workbook.getSheet("sheet1");
	return sheet.getLastRowNum();
	
		
		
	}
    public String readExcelData(String sname, int rnum, int cnum) throws EncryptedDocumentException, IOException
    {

    	FileInputStream fis=new FileInputStream(IAutoConstants.Excelpath);
    	Workbook workbook= WorkbookFactory.create(fis);
    	return workbook.getSheet(sname).getRow(rnum).getCell(cnum).getStringCellValue();
    }
public void readdatafromexcel(String sheet1,int cell,String DDvalue) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream(IAutoConstants.Excelpath);
	Workbook workbook= WorkbookFactory.create(fis);
	Sheet sheet =workbook.getSheet("sheet1");
	
	
	int lastrow=getlastrow("sheet1");
	String value="Null";
	
	for(int i=0;i<=lastrow;i++)
	{
		value=sheet.getRow(i).getCell(0).getStringCellValue();
		if(value.equalsIgnoreCase(value)) {
			break;
		}
	}
		
}

}


