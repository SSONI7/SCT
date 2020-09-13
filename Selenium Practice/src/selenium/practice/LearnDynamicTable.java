package selenium.practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LearnDynamicTable {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saniket\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']/table/tbody/tr/td[1]"));
		
		List<String> arrlist = new ArrayList<String>();
		
		for(WebElement li:list) {
			
			System.out.println(li.getText());
		}
		
		System.out.println("--------------------------------------------------------");
		
		int position=0;
		
		for(WebElement any:list) {
			
			position++;
			
			if(any.getText().equals("Centro comercial Moctezuma")) {
			Assert.assertEquals(any.getText(),"Centro comercial Moctezuma");
			System.out.println("Test Pass");
			break;
			}
		}
		
		WebElement country = driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']/table/tbody/tr["+position+"+1]/td[3]"));
		String name = country.getText();
		System.out.println("This company belongs to country:- "+name);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
