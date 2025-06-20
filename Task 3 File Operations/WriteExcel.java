package ExcelReadAndWrite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {

		// Create the workbook
		XSSFWorkbook book = new XSSFWorkbook ();
		
		// Create the sheet
		XSSFSheet sheet = book.createSheet("Sheet1");
		// Store the details -> Name (String) Age (int) City (String)
		
		Object[][] data = {
				{"Name","Age","Email"},
				{"John Doe","30","john@test.com"},
				{"John Doe","28","john@test.com"},
				{"Bob Smith","35","jacky@example.com"},
				{"Swapnil","37","swapnil@example.com"}
		};
		

		// Put the data into the sheet
		int rowCount=0;
		
		// for each to get into each row
		for (Object[] rowl: data) {
			
		XSSFRow row = sheet.createRow (rowCount++);
		int columnCount=0;
		
		// for each to get into each columns
		for (Object col: rowl) {
			
		XSSFCell cell = row.createCell (columnCount++);
		
		// Checking the type of data and making the entry 
		if (col instanceof String) {
		cell.setCellValue ((String) col);
		
		}else if (col instanceof Integer) {
			
		cell.setCellValue((Integer) col);
		}
		
		}
		
		}
		try {
			FileOutputStream output = new FileOutputStream("C:\\Users\\hry98\\eclipse-workspace\\ExcelFileOperations\\src\\main\\java\\WriteExcel.xlsx");
		    book.write(output);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		book.close();
	}
	}


