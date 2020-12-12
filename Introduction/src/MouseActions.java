import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//komallakhe//Desktop//Automation//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");

		// use actions class and send the driver object to this class to get all
		// capabilities of action class methods
		Actions a = new Actions(driver);

		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(move).build().perform();

		// to write in caps in search bar we use keyDown -shift
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
				.doubleClick().build().perform();

		// to right click
		a.contextClick(driver.findElement(By.id("twotabsearchtextbox"))).build().perform();

	}

}
