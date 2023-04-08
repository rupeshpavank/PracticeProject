package com.TestProject.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws Exception {
		
		File fp=new File("D:\\TestData.xlsx");
		FileInputStream inputStream = new FileInputStream(fp);
		Workbook wb=new XSSFWorkbook(inputStream);
		Sheet mySheet=	wb.getSheet("Practice");
		
		int rowCount=mySheet.getLastRowNum()-mySheet.getFirstRowNum();
		
		System.out.println("The Row count is:"+rowCount);
		
		Row row=mySheet.getRow(0);
		
		System.out.println(""+row.getLastCellNum());
		
	    Row newRow = mySheet.createRow(rowCount+1);
	    
	    for(int j = 0; j < row.getLastCellNum(); j++){

	        //Fill data in row

	        Cell cell = newRow.createCell(j);

	        cell.setCellValue("Rupesh Test");

	        inputStream.close();

	        FileOutputStream outputStream = new FileOutputStream(fp);
	        
	        wb.write(outputStream);

	    }

		
	}

}
