import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//komallakhe//Desktop//Automation//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("2"); // INR
		s.selectByIndex(2); // AED
		s.selectByVisibleText("AED");

	}

}
