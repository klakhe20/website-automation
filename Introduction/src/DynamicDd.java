import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDd {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//komallakhe//Desktop//Automation//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize(); //maximize windows before taking any action

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //15sec delay
		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BOM']")).click();

		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		  driver.findElement(By.xpath("(//a[@value='IXJ'])[2]")).click(); //using 2nd matched value
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXJ']")).click();
		 //parent xpath space child xpath
		  
		

	}

}
