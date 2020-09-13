package selenium.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AutomatedTesterWebsite {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saniket\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://book.theautomatedtester.co.uk/");
		driver.findElement(By.xpath("//a[contains(text(),'Chapter1')]")).click();
		WebElement radio = driver.findElement(By.xpath("//input[@id='radiobutton']"));
		radio.click();
		driver.navigate().refresh();
		Thread.sleep(3000);
		Select drop = new Select(driver.findElement(By.xpath("//select[@id='selecttype']")));
		drop.selectByVisibleText("Selenium RC");
		Thread.sleep(3000);
		drop.selectByIndex(1);
		Thread.sleep(3000);
		WebElement homePage = driver.findElement(By.xpath("//a[contains(text(),'Home Page')]"));
		homePage.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Chapter1')]")).click();
		String text = driver.findElement(By.xpath("//div[@id='divontheleft']")).getText();
		Assert.assertTrue(true,text);
		Thread.sleep(3000);
		driver.close();
	}

}
