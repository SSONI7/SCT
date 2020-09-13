package selenium.Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnWriteExcel {

	public static void main(String[] args) {
		
		
		try {
			File file = new File("C:\\Users\\Saniket\\Desktop\\test1.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheetAt(0);
			
			Row row = sh.createRow(0);
			Cell cell = row.createCell(0);
			
			cell.setCellValue("saniket");
			
			String a = cell.getStringCellValue();
			System.out.println(a);
			
			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
