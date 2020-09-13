package WebDriverEventListeners;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase extends TestBase {
	
	@Test
	public void TestRun() {
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		String parent = driver.getWindowHandle();
	
		System.out.println(parent);
		
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String childwindow = itr.next();
			if(!parent.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.close();
			}
		}
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.switchTo().window(parent);
		WebElement login = driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
		login.click();
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
		username.sendKeys("saniket@outlook.com");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		password.sendKeys("saniket@123");
		WebElement login_button = driver.findElement(By.xpath("//button[@class='btn-primary loginButton']"));
		login_button.click();
		
	}
	

    
}
