package selenium.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleElementException {
	
	public static void main(String [] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Saniket\\Desktop\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://freecrm.co.in/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement price = driver.findElement(By.xpath("//a[contains(text(),'Pricing')]"));
	price.click();
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	try {
	price.click();
	}catch(StaleElementReferenceException e) {
	
	    price = driver.findElement(By.xpath("//a[contains(text(),'Pricing')]"));
		price.click();
		Thread.sleep(5000);
	}
	driver.close();
	

	}
}
