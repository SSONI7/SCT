package selenium.Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexcel {

	public static void main(String[] args) throws IOException {
	
	try {
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\Saniket\\Desktop\\test.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
//		Iterator<Row> row = sh.iterator();
//		while(row.hasNext()) {
//			Row row1 = row.next();
//			Iterator<Cell> cell = row1.iterator();
//			while(cell.hasNext());
//			Cell cell1 = cell.next();
//			switch(cell1.getCellType()){
//			case Cell.CELL_TYPE_STRING:
//				System.out.println(cell1.getStringCellValue() +"t");
//				break;
//			case Cell.CELL_TYPE_NUMERIC:
//				System.out.println(cell1.getNumericCellValue() +"t");
//			    break;
//			}
//			System.out.println("");
//		}
//		fis.close();
		Row row = sh.createRow(0);
		Cell cell = row.createCell(0);
	//	cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue("SANI");
		String a = cell.getStringCellValue();
		System.out.println(a);
		FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Saniket\\Desktop\\test.xlsx"));
		wb.write(fos);
	}catch(Exception e){
		System.out.println("Exception handled");
	}
	}
	


}
