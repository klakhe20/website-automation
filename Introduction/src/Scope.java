import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//komallakhe//Desktop//Automation//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");

		// 1. Count of links on webpage
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2. Count of links in the footer section - concept of limiting WebDriver scope
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3. Count of links of first column in footer
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// 4. Click on each link and check if pages open
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {

			String clickonlinktab = Keys.chord(Keys.COMMAND, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000L);

		}

		// 5. Get the title of each page
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();

		while (it.hasNext()) // t returns true if Iterator has more element to iterate.
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

}
