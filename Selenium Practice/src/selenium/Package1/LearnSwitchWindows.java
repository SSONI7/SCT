package selenium.Package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSwitchWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saniket\\Desktop\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		String parent = driver.getWindowHandle();
		System.out.println("This is parent window "+parent);
		
		Set<String> child = driver.getWindowHandles();
		
		Iterator itr = child.iterator();
		
		while(itr.hasNext()) {
			
			String childwindows = (String) itr.next();
			if(!parent.equalsIgnoreCase(childwindows)) {
				driver.switchTo().window(childwindows);
				Thread.sleep(3000);
				driver.close();
				
			}
		}

	}

}
