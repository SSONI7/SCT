package selenium.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public static void main(String[] args) {


		WebDriver driver = null;
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		FluentWait<WebDriver> wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//div[@contains,'text()'"));
		
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(3,TimeUnit.SECONDS).ignoring(Exception.class);
	   
		WebDriverWait wait2 = new WebDriverWait(driver,30);
		wait = new FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(3,TimeUnit.SECONDS).ignoring(Exception.class);
		
		
	}

}

