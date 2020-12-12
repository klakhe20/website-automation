import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitImpExp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//komallakhe//Desktop//Automation//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		// String itemNeeded="Cucumber"; string
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" }; // array

		Thread.sleep(3000);
		addItems(driver, itemsNeeded);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));

		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");

		// Explicit Wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.promoBtn")));

		driver.findElement(By.cssSelector("button.promoBtn")).click();

		// Explicit Wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.close();

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name")); // productnames on website
																							// collected inlist

		int j = 0;

		for (int i = 0; i < products.size(); i++) {
			// Brocolli - 1 Kg

			// Brocolli, 1 kg

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			// format it to get actual vegetable name

			// convert array into array list for easy search

			// check whether name you extracted is present in arrayList or not-

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{

				j++;
				// click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}

			}
		}
	}
}
