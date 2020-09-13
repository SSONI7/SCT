package selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LearnDesiredCapability {

	public static void main(String[] args) {
		
				DesiredCapabilities handlSSLErr = new DesiredCapabilities();     
				handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
				handlSSLErr.setVersion("84");
				System.out.println(handlSSLErr.getBrowserName());
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Saniket\\Desktop\\chromedriver.exe");
				WebDriver driver = new ChromeDriver (handlSSLErr);
				driver.get("https://www.browserstack.com/users/sign_in");

	}

}
