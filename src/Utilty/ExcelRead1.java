
package Utilty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 


	public static void main(String[] args) throws IOException 
	{
		
		File f=new File ("C:\\Users\\User\\Documents\\Book2.xlsx");
		Workbook wb=new XSSFWorkbook(f);
		Sheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		{
			for(int i=0;i<=sh.getLastRowNum();i++)
			{
				
				System.out.println(sh.getRow(i).getCell(2).getStringCellValue());
			}
		}
	}	
	


