package selenium.Package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnWriteToExcel {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Saniket\\Desktop\\test1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		Row row = sheet.getRow(0);
		Cell cell = row.createCell(0);
		
		cell.setCellValue("saniket");
		
		FileOutputStream fos = new FileOutputStream(file);
	
		wb.write(fos);
		
		
	}

}
