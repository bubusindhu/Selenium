package testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream f=new FileInputStream("C:\\Users\\User\\Documents\\Book2.xlsx");
		Workbook wb=new XSSFWorkbook(f);
		Sheet sh=wb.getSheet("Sheet1");
		Row rw=sh.createRow(0);
		Cell c=rw.createCell(0);
		c.setCellType(CellType.STRING);
		c.setCellValue("india");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\User\\Documents\\Book2.xlsx");
				
		wb.write(fo);
		wb.close();

	}

}
