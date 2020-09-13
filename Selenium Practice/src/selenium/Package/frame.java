package selenium.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saniket\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		WebElement fra = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(fra);
		WebElement text = driver.findElement(By.xpath("//body[@id='tinymce']"));
		text.clear();
		text.sendKeys("saniket");
		Thread.sleep(5000);
		
		driver.close();
		
		

	}

}
