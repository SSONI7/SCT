package selenium.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnWebElements {
	
	public static void main(String [] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saniket\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
		WebElement searchbutton = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		searchbox.sendKeys("hello all");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(searchbox.getText());
		searchbox.clear();
		System.out.println("location " +searchbox.getLocation());
		System.out.println(searchbox.getTagName());
		System.out.println(searchbox.getText());
		System.out.println("size " +searchbox.getSize());
		System.out.println("attribute name " +searchbox.getAttribute("name"));
		System.out.println("Text Box is displayed " +searchbox.isDisplayed());
		System.out.println("Text Box is enabled " +searchbox.isEnabled());
		System.out.println("Text Box is selected " +searchbox.isSelected());
		System.out.println("Text button is enabled " +searchbutton.isEnabled());
		System.out.println("Text button is displayed " +searchbutton.isDisplayed());
		System.out.println("Text button is Selected " +searchbutton.isSelected());
		Thread.sleep(5000);
		
		
		
		driver.close();
	}

}
