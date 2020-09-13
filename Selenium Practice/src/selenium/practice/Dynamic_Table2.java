package selenium.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Dynamic_Table2 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saniket\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		Thread.sleep(5000);
		
		List<WebElement> lists = driver.findElements(By.xpath("//div[@Class='ui-grid-row ng-scope']/div[1]/div[1]"));
		List<String> arrlist = new ArrayList<String>();
		
		for(WebElement li:lists) {
		 arrlist.add(li.getText());
		}
		
		for(String li1:arrlist) {
			
			System.out.println(li1);
		}
		
		System.out.println("-----------------------------------");
		
		if(arrlist.contains("Aniya_Flatley36@hotmail.com")) {
			
			System.out.println("Test Pass");
		}else {
			
			System.out.println("Test Fail");
		}
	
		/*Thread.sleep(5000);
		
		driver.quit();*/
		
		int position = 0;
		
		for(WebElement email:lists) {
			
			position++;
			if(email.getText().equals("qkkj@akjs.sjs")) {
			Assert.assertEquals(email.getText(),"qkkj@akjs.sjs");
				break;
			}
		}
		
		WebElement pencil = driver.findElement(By.xpath("//div[@Class='ui-grid-row ng-scope']["+position+"]/div/div[6]/user-click-select/div/button"));
		
		Actions action = new Actions(driver);
		action.moveToElement(pencil).doubleClick().build().perform();
		
		WebElement edit = driver.findElement(By.xpath("//div[@Class='ui-grid-row ng-scope']["+position+"]/div/div["+position+"]"));
		edit.sendKeys("saniket@outlook.com");
		
		
		Thread.sleep(5000);

	}

}
