package com.TestProject.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ReadDataFromExcel {
	

	public static void main(String[] args) throws Exception {
		
		File fp=new File("D:\\TestData.xlsx");
		
	    FileInputStream inputStream = new FileInputStream(fp);

	    Workbook  wb=new XSSFWorkbook(inputStream);
		
	    Sheet guru99Sheet = wb.getSheet("Practice");
	    
	    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
	    
	    System.out.println(rowCount);

	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = guru99Sheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	        }

	        System.out.println();
	}

}

	
	
}