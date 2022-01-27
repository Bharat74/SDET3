 package com.Vtiger.genericUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtil {
	
	private FileUtil() {
		
	}
	public static FileUtil objectofFlieUtil() {
		 FileUtil prop=new  FileUtil();
		 return prop;
		
	}
	
	public String readdatfrompropfile(String key) throws IOException {
		
		FileInputStream fls=new FileInputStream(IAutoConstants.propfilepath);
		Properties prop =new Properties();
		prop.load(fls);
		return prop.getProperty(key);
		
	}

	public String readdatafrompropfile(String key,String path) throws IOException {
		FileInputStream fls=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fls);
		return prop.getProperty(key);
		
		
		
	}
}
