package Utilty;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.WorkbookProvider;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelRead2 
{

	public static Object[][]Readdata() throws IOException
	{	
		FileInputStream f=new FileInputStream("C:\\Users\\User\\Documents\\Book4.xlsx");
	Workbook wb= new XSSFWorkbook(f);
	Sheet sh= wb.getSheet("Sheet1");
	String[][]obj=new String [sh.getLastRowNum()+1][sh.getRow(0).getLastCellNum()];
	for (int i=0;i<=sh.getLastRowNum();i++)
	{
		for (int j=0;j<=sh.getRow(0).getLastCellNum()-1;j++)
				{
					obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
					
				}		
	}	
	return obj;
		
}
				
	}
		
	

