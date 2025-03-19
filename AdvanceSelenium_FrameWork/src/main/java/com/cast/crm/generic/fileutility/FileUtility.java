package com.cast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String getDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\SeleniumProject1\\AdvanceSelenium_FrameWork\\configAppData\\commondata.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	
	
	
	
	
	
	}

}
