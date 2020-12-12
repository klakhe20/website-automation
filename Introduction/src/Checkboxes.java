import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//komallakhe//Desktop//Automation//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// To check if checkbox is selected
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());

		// select the checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();

		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());

		// Count the number of checkboxes

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// to select student checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();

	}

}
