package links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAllLinks {

	static WebDriver driver;

	public static final String webpage = "https://www.yahoo.com";

	public static final int DEFAULT_WAIT_4_PAGE = 20;

	public static void main(String[] args) {

		// load a new instance of firefox driver
		driver = new FirefoxDriver();

		// add initial implicit wait
		driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT_4_PAGE, TimeUnit.SECONDS);

		// maximize window
		driver.manage().window().maximize();

		// navigate to www.yahoo.com
		driver.get(webpage);

		// save left links to list 
		List <WebElement> allLinks = driver.findElements(By.xpath(".//span[contains(@id,'yui_3_18_0_4_1454981472699')]"));
		
		// print links info and click 
		for(int i = 0 ; i <= allLinks.size() ; i++){
			System.out.println(" Name of Link #"+i+allLinks.get(i).getText());
			System.out.println(" URL of Link #"+i+allLinks.get(i).getAttribute("href"));
			//allLinks.get(i).click();
			//System.out.println("Current Page Title : " + driver.getTitle());
		}
	}

}
