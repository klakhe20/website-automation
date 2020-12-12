import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Create driver object for chrome driver
		
System.setProperty("webdriver.chrome.driver", "//Users//komallakhe//Desktop//Automation//chromedriver");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://google.com");
	
	
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
		
	driver.get("http://yahoo.com");
	
	//System.out.println(driver.getPageSource());
	
	driver.navigate().back();
	driver.navigate().forward();
	
	driver.close();// closes current browser
	//driver.quit(); closes all browsers - quit the driver

	}

}
