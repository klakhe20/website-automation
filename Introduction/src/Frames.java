import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//komallakhe//Desktop//Automation//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://api.jqueryui.com/droppable/");

		// System.out.println(driver.findElement(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		System.out.println("css works?");

		Actions a = new Actions(driver);
		driver.findElement(By.id("draggable")).click();
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		a.dragAndDrop(source, target).build().perform();

	}

}
