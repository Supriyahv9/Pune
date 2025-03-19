package com.cast.crm.generic.fileutility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONUtility {
	
	public void getDataFromJsonFile() throws FileNotFoundException, IOException, ParseException {
	
	//Step1:convert json physical file into java object by using Json parse class
		JSONParser parser = new JSONParser();
		//tofetch physical file
	Object	obj=parser.parse(new FileReader("C:\\SeleniumProject1\\AdvanceSelenium_FrameWork\\configAppData\\commondata.json"));
		//Step2:convert java object into json object
			JSONObject jobj = (JSONObject)obj;
			
		

}
}
