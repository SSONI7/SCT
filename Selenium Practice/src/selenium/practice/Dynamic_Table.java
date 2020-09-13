package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saniket\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.findElements(By.xap)
		//driver.get("http://demo.guru99.com/test/web-table-element.php");
		
	
        List<WebElement> col = driver.findElements(By.tagName("a"));
		System.out.println("Number of links "+col.size());
//		System.out.println("Total number of columns are: "+col.size());
//		
//		List<WebElement> row = driver.findElements(By.xpath(".//*[@id = 'leftcontainer']/table/tbody/tr/td[1]"));
//		System.out.println("Total number of rows are: "+row.size());
//		
//		WebElement company = driver.findElement(By.xpath(".//*[@id = 'leftcontainer']/table/tbody/tr[4]/td[1]"));
//		System.out.println("Company name is "+company.getText());
//		
//		String newflag = driver.findElement(By.xpath("//div[@class='curLink tabs']")).getCssValue("background");
//		System.out.println("Background color is "+newflag);
//		
//		driver.get("https://www.linkedin.com/");
//        String buttonColor = driver.findElement(By.xpath("//button[@class='sign-in-form__submit-button']")).getCssValue("background-color");
//        String buttonTextColor = driver.findElement(By.xpath("//button[@class='google-sign-in-cta__button']")).getCssValue("color");
//        System.out.println("Button color: " + buttonColor);
//        System.out.println("Text color " + buttonTextColor);

	}

}
