import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//komallakhe//Desktop//Automation//chromedriver");

		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.facebook.com/");

		// driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("rani");

		// driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("mrun");

		// driver.findElement(By.cssSelector("#u_0_b")).click();

		// Customized Xpath and CSS:

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("kom");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("lak");

		driver.get("https://www.ggu.edu/login");

		// driver.findElement(By.xpath("//div[@class=‘form-area’]/div[2]/div")).sendKeys("abcd");
		// driver.findElement(By.xpath("//div[@class=‘form-area’]/div[2]/div[2]/input")).sendKeys("mellon");

		driver.findElement(By.xpath("//input[contains(@id,'main')]")).sendKeys("kom"); // regular exp for expath
		// driver.findElement(By.cssSelector("div[class='text-input']")).sendKeys("lakhe");

		driver.findElement(By.cssSelector("a.link")).click(); // another way to write css for classname

	}

}
