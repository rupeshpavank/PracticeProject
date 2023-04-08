package com.TestProject.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelDataFunction {
	
	@Test
	public void readTestData() throws Exception {

		
		File fp=new File("D:\\TestData.xlsx");
		
	    FileInputStream inputStream = new FileInputStream(fp);

	    Workbook  wb=new XSSFWorkbook(inputStream);
		
	    Sheet mySheet = wb.getSheet("Practice");
	    
	    String colName="Subject";
	    int col_Num = -1;
	    
	   Row row = mySheet.getRow(0);
		for (int i = 0; i < row.getLastCellNum(); i++) {
			// System.out.println(row.getCell(i).getStringCellValue().trim());
			if (row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
				col_Num = i;
		}
			row = mySheet.getRow(1);
		
			Cell cell = row.getCell(col_Num);
			
		String s=	cell.getStringCellValue();
System.out.println("************"+s);

	}

}

