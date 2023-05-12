package utilities;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


public class ExcelWrite {
	
	public static void main(String args[]) throws IOException {
		
		write();
	}
	
	static final String FILE_PATH="D:\\Auto.xlsx";
	
	public static void write() throws IOException {
		//workbook
		
		Workbook wb= new XSSFWorkbook();
		
		//sheet
		Sheet sheet= wb.createSheet("Automation_Classes");
		
		
		//create row
		Row row= sheet.createRow(0);
		
		
		
		//create cell
		Cell cell= row.createCell(0);
		
		// set value
		
		cell.setCellValue("Excel write");
		
		try (FileOutputStream outputStream = new FileOutputStream(FILE_PATH)) 
		{
            wb.write(outputStream);
        }
		
		
	}
	
}
