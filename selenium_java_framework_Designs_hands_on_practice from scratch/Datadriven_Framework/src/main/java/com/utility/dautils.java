package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;





public class dautils {
	
	
	
	
	public String infoac(String keyvalue) throws IOException {
		FileInputStream ghs=new FileInputStream("./src/test/resources/config.properties");
		Properties sa=new Properties();
		sa.load(ghs);
		String so=sa.getProperty(keyvalue);
		return so;
	}
	
	
	
	public String dataut(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fss=new FileInputStream("./src/main/resources/site_name.xlsx");
		Workbook workbook=WorkbookFactory.create(fss);
		Sheet sheet=workbook.getSheet(sheetName);
		 Row row = sheet.getRow(rowNum);
		 Cell cell = row.getCell(cellNum);
		String sx=cell.getStringCellValue();
		System.out.println(sx);
		return sx;
		
		
	}

}
