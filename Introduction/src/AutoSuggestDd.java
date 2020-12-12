import java.sql.Driver;
import java.util.List;

import javax.print.DocFlavor.INPUT_STREAM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//provide input and look for common locator of options
		
		System.setProperty("webdriver.chrome.driver", "//Users//komallakhe//Desktop//Automation//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input#autosuggest")).sendKeys("ind");
		Thread.sleep(3000); //wait for options to load
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option :options)  //iteration used to find India among auto suggestive options
			
		{
			if (option.getText().equalsIgnoreCase("India"))
					{
				
				option.click();
				
				break;                   //to stop the loop when it finds the option
					
					}
			
		}
		
		
		
	}

}



