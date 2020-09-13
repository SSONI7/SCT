package selenium.Package;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saniket\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.naukri.com/");
	    
	    
	    String Parent = driver.getWindowHandle();
	    System.out.println(Parent);
	    
	    Set<String> child = driver.getWindowHandles();
	    //System.out.println(child);
	    Iterator<String> itr = child.iterator();
	    
	    while(itr.hasNext()) {
	    	String childwindow = itr.next();
	    	if(!Parent.equalsIgnoreCase(childwindow)) {
	    		driver.switchTo().window(childwindow);
	    		driver.close();
	    	}
	    }
	   
	
	}}
