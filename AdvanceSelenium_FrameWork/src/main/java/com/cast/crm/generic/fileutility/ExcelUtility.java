package com.cast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getDataFromExcelFile(String sheetname,int rownum,int colnum) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("src\\test\\resources\\exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(rownum).getCell(colnum).getStringCellValue();
	return data;
	
	
	}
	
	public void setDataIntoCell(String sheetname,int rownum,int colnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("src\\test\\resources\\exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet(sheetname).getRow(rownum).createCell(colnum);
		 
		 FileOutputStream fos = new FileOutputStream("src\\test\\resources\\exceldata.xlsx");
			wb.write(fos);
			wb.close();
	}
	
	/**
	 * It is used to get the number of RowCount from specified sheet
	 * @param SheetName
	 * @return
	 * @throws Throwable
	 */
	public int getRowCount(String SheetName) throws Throwable
	{
		FileInputStream fisExcel=new FileInputStream("src\\test\\resources\\exceldata.xlsx");
		Workbook wb = WorkbookFactory.create(fisExcel);
		Sheet sheet = wb.getSheet(SheetName);
		wb.close();
		return sheet.getLastRowNum();

    }
}
