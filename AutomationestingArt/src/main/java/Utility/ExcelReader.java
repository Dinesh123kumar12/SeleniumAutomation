package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws Exception {
		// Specify the path
		File  src=new File ("C:\\Users\\elcot\\Desktop\\mydata.xlsx");
		
		// load file 
		FileInputStream fis=new FileInputStream(src);
		
		//Load Workbook
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		//Load sheet
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		System.out.println(sh1.getRow(0).getCell(0).getRichStringCellValue());
		System.out.println(sh1.getRow(0).getCell(1).getRichStringCellValue());

		System.out.println(sh1.getRow(1).getCell(0).getRichStringCellValue());
		System.out.println(sh1.getRow(1).getCell(1).getRichStringCellValue());

		System.out.println(sh1.getRow(2).getCell(0).getRichStringCellValue());
		System.out.println(sh1.getRow(2).getCell(1).getRichStringCellValue());
		

		System.out.println(sh1.getRow(3).getCell(0).getRichStringCellValue());
		System.out.println(sh1.getRow(3).getCell(1).getRawValue());
		
		sh1.getRow(1).createCell(1).setCellValue("Passed");
		sh1.getRow(2).createCell(2).setCellValue("Allowed ");
		sh1.getRow(3).createCell(3).setCellValue("Countent");
		sh1.getRow(4).createCell(4).setCellValue("countinued");
		
	}
		

	}


