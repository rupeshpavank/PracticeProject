package com.TestProject.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSReader {
	
	public String path;
	public FileInputStream fis=null;
	public FileOutputStream fos=null;
	public XSSFWorkbook workbook=null;
	public XSSFSheet sheet=null;
	public XSSFRow row=null;
	public XSSFCell cell=null;
	
	
	public XLSReader(String path) {
		this.path=path;
		
		try {
			File fp=new File(path);
			fis=new FileInputStream(fp);
			workbook=new XSSFWorkbook(fis);
			sheet=workbook.getSheetAt(0);
			fis.close();

		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
	
	}
	
	public int RowCount(String sheetName) {
		
		int index=workbook.getSheetIndex(sheetName);
		if(index==-1)
			return 0;
		else {
			sheet=workbook.getSheetAt(index);
				int rowNumber=sheet.getLastRowNum()+1;
				return rowNumber;
			
		}
		
		
		
		
	}
	
	/*
	 * public String getCellData(String sheetName, String colName, int rowNum) { try
	 * { if (rowNum <= 0) return "";
	 * 
	 * int index = workbook.getSheetIndex(sheetName); int col_Num = -1; if (index ==
	 * -1) return "";
	 * 
	 * sheet = workbook.getSheetAt(index); row = sheet.getRow(0); for (int i = 0; i
	 * < row.getLastCellNum(); i++) { //
	 * System.out.println(row.getCell(i).getStringCellValue().trim()); if
	 * (row.getCell(i).getStringCellValue().trim().equals(colName.trim())) col_Num =
	 * i; } if (col_Num == -1) return "";
	 * 
	 * sheet = workbook.getSheetAt(index); row = sheet.getRow(rowNum - 1); if (row
	 * == null) return ""; cell = row.getCell(col_Num);
	 * 
	 * if (cell == null) return ""; // System.out.println(cell.getCellType()); if
	 * (cell.getCellType() == CellType.STRING) return cell.getStringCellValue();
	 * else if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() ==
	 * CellType.FORMULA) {
	 * 
	 * String cellText = String.valueOf(cell.getNumericCellValue()); if
	 * (DateUtil.isCellDateFormatted(cell)) {
	 * 
	 * // format in form of M/D/YY double d = cell.getNumericCellValue();
	 * 
	 * Calendar cal = Calendar.getInstance(); cal.setTime(DateUtil.getJavaDate(d));
	 * cellText = (String.valueOf(cal.get(Calendar.YEAR))).substring(2); cellText =
	 * cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH) + 1 + "/" +
	 * cellText;
	 * 
	 * // System.out.println(cellText);
	 * 
	 * }
	 * 
	 * return cellText;
	 * 
	 * } else if (cell.getCellType() == CellType.BLANK) return ""; else return
	 * String.valueOf(cell.getBooleanCellValue());
	 * 
	 * } catch (Exception e) {
	 * 
	 * e.printStackTrace(); return "row " + rowNum + " or column " + colName +
	 * " does not exist in xls"; } }
	 */
	

}
