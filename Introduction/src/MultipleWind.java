import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//komallakhe//Desktop//Automation//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

		driver.findElement(By.linkText("Help")).click();

		System.out.println("Before Switching");
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> iterator = ids.iterator();
		String parent = iterator.next();
		String child = iterator.next();

		System.out.println("After Switching");
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());

		System.out.println("Switching back to parent");
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());

	}

}
