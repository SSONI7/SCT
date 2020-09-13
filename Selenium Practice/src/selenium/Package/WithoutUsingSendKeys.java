package selenium.Package;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutUsingSendKeys {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saniket\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://book.theautomatedtester.co.uk/chapter4");
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		js.executeScript("document.getElementById('dateInput').value = 'saniket'");
	}

}
