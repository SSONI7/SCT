package WebDriverEventListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public WebDriver dr;
	public EventFiringWebDriver driver;
	public WebDriverEventListeners eventlistener;

	@BeforeTest
	public void browser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saniket\\Desktop\\chromedriver.exe");
		dr = new ChromeDriver();
		driver = new EventFiringWebDriver(dr);
		eventlistener = new WebDriverEventListeners();
		driver.register(eventlistener);
	}
	
}
