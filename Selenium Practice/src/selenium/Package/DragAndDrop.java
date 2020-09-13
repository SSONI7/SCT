package selenium.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragAndDrop {

	public static void main(String[] args) {


		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saniket\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		WebElement from = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		
		WebElement to  = driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		WebElement debit= driver.findElement(By.xpath("//h3[contains(text(),'DEBIT SIDE')]"));
		
		Actions actions = new Actions(driver);
		
		//actions.dragAndDrop(from,to).build().perform();
		
		actions.contextClick(debit).build().perform();
		
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		
		
	}

}
