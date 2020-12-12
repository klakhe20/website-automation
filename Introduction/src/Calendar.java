import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users//komallakhe//Desktop//Automation//chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		Thread.sleep(6000);
		
		
		//April 23 - Selecting month
		driver.findElementByXPath(".//*[@id='travel_date']").click();


		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}


		//Selecting day
		List<WebElement> dates= driver.findElements(By.className("day"));
		
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.className("day")).size();

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
		driver.findElements(By.className("day")).get(i).click();
		break;
		}

	}

}
	
}
