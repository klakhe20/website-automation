import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users//komallakhe//Desktop//Automation//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		
		//String itemNeeded="Cucumber"; string
		String[] itemsNeeded= { "Cucumber","Brocolli","Beetroot" }; //array
		
		List<String> listItems = new ArrayList<>();
		listItems.add("Cucumber");
		listItems.add("Brocolli");
		listItems.add("Beetroot");
	
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);

	}

	

public static void addItems(WebDriver driver,String[] itemsNeeded)
{

List<WebElement>products= driver.findElements(By.cssSelector("h4.product-name")); //productnames on website collected inlist
	
int j=0;	

for(int i=0;i<products.size();i++)
	{
		//Brocolli - 1 Kg

		//Brocolli,    1 kg

		String[] name=products.get(i).getText().split("-");

		String formattedName=name[0].trim();
	
	//format it to get actual vegetable name

	//convert array into array list for easy search

	//  check whether name you extracted is present in arrayList or not-

	List itemsNeededList = Arrays.asList(itemsNeeded);

	if(itemsNeededList.contains(formattedName))

	{

	j++;
//click on Add to cart
	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

	
	
//	if(j==itemsNeeded.length) // int, long, double, float, char, short, byte, -prmitive
//	int num = 51;
//
//	{
//
//	break;
//
//	}
//
//
	}
}
}
}
	
	
	

	
	
