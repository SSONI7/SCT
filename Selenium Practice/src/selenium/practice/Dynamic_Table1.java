package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table1 {

	public static void main(String[] args) {


		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saniket\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/table.html");
		
		WebElement mytable = driver.findElement(By.xpath("/html/body/table/tbody"));
		
		List<WebElement> rows = mytable.findElements(By.tagName("tr"));
		int row_count = rows.size();
		System.out.println("Row Count is "+row_count);
		
		for(int i=0;i<row_count;i++) {
			
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			int col_count = cols.size();
			System.out.println("Column Count is "+col_count);
			
			for(int j=0;j<col_count;j++) {
				
				String celText = cols.get(j).getText();
				System.out.println("Number of columns in the row is "+col_count+" and value of column is "+celText);
			}
			
			System.out.println("------------------------------------------------------------------------");
		}
		
	

	}

}
