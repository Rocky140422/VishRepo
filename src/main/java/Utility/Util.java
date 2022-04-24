package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Util {
	
	public static String readExcel (int rowNum,int colNum) throws EncryptedDocumentException, IOException  
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\FrameWorkPractice\\ExcelData\\Zerodha test data.xlsx");
	     Sheet excelSheet = WorkbookFactory.create(file).getSheet("Sheet1");
	   return excelSheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
	}
}
	
	
	
	
	

