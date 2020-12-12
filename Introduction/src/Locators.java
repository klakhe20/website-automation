import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//komallakhe//Desktop//Automation//chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://facebook.com");

		driver.findElement(By.name("email")).sendKeys("black");

		driver.findElement(By.id("pass")).sendKeys("abcd");

		driver.findElement(By.linkText("Forgot account?")).click(); // link-look for anchor a

		// System.out.println(driver.findElement(By.linkText("Forgot
		// account?")).getText());

		// driver.close();

	}

}
