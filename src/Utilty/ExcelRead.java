package Utilty;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead 
{
	public static void main(String[]args) throws InvalidFormatException, IOException
	{
	File f=new File("C:\\Users\\User\\Documents\\Book1.xlsx");
	Workbook wb=new XSSFWorkbook(f);
	Sheet sh=wb.getSheet("Sheet1");
	System.out.println(sh.getFirstRowNum());
	System.out.println(sh.getLastRowNum());
	
	
	}
}
