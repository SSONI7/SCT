package SCT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SCT {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saniket\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		signIn.click(); // click on signin  link
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("sct.test@grr.la"); // enter username
		
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("SCT@123"); // enter password
		
		
		WebElement sign_button = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		sign_button.click(); // click on sign in button
		
		WebElement woman_category = driver.findElement(By.xpath("//a[@title='Women']"));
		woman_category.click();
		
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)", "");
        
        
        ArrayList<String> arrList = new ArrayList<String>();
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='right-block']/h5/a"));
        
        for(WebElement li:list) {
        	arrList.add(li.getText());	
        }
       
        Collections.sort(arrList); // Sort in acending order
        System.out.print(arrList); // Sorted List of Lables
      
        System.out.println();
        
        ArrayList<String> arrPriceList = new ArrayList<String>();
        List<WebElement> Pricelist = driver.findElements(By.xpath("//div[@class='right-block']/p/following::div/span[@class='price product-price']"));
        
        for(WebElement li1:Pricelist) {
        	arrPriceList.add(li1.getText());
        }
        
        Collections.sort(arrPriceList); // Sort in acending order
        System.out.print(arrPriceList);// Sorted List of price
         
             
        WebElement Wdresses = driver.findElement(By.xpath("//div[@class='subcategory-image']//a[@title='Dresses']"));
        Wdresses.click();   // click on dresses
        
        WebElement WEvedresses = driver.findElement(By.xpath("//div[@class='subcategory-image']//a[@title='Evening Dresses']"));
        WEvedresses.click();  // click on Evening dresses
     
        WebElement CheckMedium = driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_2']"));
        CheckMedium.click();  // Click on medium size check box
        
        WebElement CheckPink = driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_24']"));
        CheckPink.click();  // click on Pink color check box
        
        
        WebElement slider = driver.findElement(By.xpath("//div[@class='ui-slider-range ui-widget-header ui-corner-all']"));
        int width =slider.getSize().getWidth();
      //  System.out.println(width);
        
        Actions action = new Actions(driver);
        action.clickAndHold(slider);
        action.moveByOffset(width,183);
        action.build().perform();
      
		//Thread.sleep(5000);
		//driver.quit();
	}

	
	}

