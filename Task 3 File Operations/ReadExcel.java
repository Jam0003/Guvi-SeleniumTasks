package ExcelReadAndWrite;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		// Open the Workbook
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\hry98\\eclipse-workspace\\ExcelFileOperations\\src\\main\\java\\WriteExcel.xlsx");

		//Open the Sheet
		XSSFSheet sheet = book.getSheet("WriteExcel");

		//Get the no. of rows
		int rowCount = sheet.getLastRowNum();
		
		// get the column count
		int columnCount = sheet.getRow (0).getLastCellNum();
		
		// Create 2D array
		String[][] data = new String[rowCount] [columnCount];
		
		// Get into each row
		for (int i=0; i<rowCount; i++) {
		XSSFRow row = sheet.getRow(i);
		
		// get into the column
		for (int j=0; j<columnCount; j++) {
		XSSFCell cell = row.getCell(j);
		
		// read the value
		System.out.print(cell.getStringCellValue()+" ");
		
		// to store in array
		data[i][j]=cell.getStringCellValue();
		
		}
		
		System.out.println();
		
		}
		System.out.println("Printing from array");
		
		for (String[] row: data) {
			
		
		for (String x : row) {
			
		
		System.out.println(x +" ");
		
		  }
		}
		book.close();
		
		}

			}

		
