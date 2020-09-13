package selenium.Package;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnReadExcle {

	public static void main(String[] args) {

		
		try {
			
			File file = new File("C:\\Users\\Saniket\\Desktop\\DataFile.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheetAt(0);
			
				System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
				System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
				System.out.println(sh.getRow(2).getCell(0).getStringCellValue());
				System.out.println(sh.getRow(3).getCell(0).getStringCellValue());
				System.out.println(sh.getRow(4).getCell(0).getStringCellValue());

		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
