package links;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAllLinks {

	

	public static final String webpage = "https://www.yahoo.com";

	public static final int DEFAULT_WAIT_4_PAGE = 20;
	


	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get(webpage);
		
		Thread.sleep(3000L);
		
		List<WebElement> links = driver.findElements(By.xpath(".//span[contains(@id,'yui_3_18_0_4_1454981472699')][contains(@class,'Va(m) ')]"));

		Iterator<WebElement> iter = links.iterator();

		while(iter.hasNext()) {
		    WebElement we = iter.next();

		       we.click();
		       driver.navigate().back();
		    }
		
		
/*		Thread.sleep(3000L);

		List<WebElement> allLinks =   
				  driver.findElements(By.xpath(".//span[contains(@id,'yui_3_18_0_4_1454981472699')][contains(@class,'Va(m) ')]"));

		int count = allLinks.size()-1;
		for (int i = 0 ; i<count ; i++){
			allLinks.get(i).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
		}*/
		 
				 
/*		driver.get(webpage);
		List<WebElement> linksize = driver.findElements(By.xpath(".//span[contains(@id,'yui_3_18_0_4_1454981472699')][contains(@class,'Va(m) ')]")); 
		linksCount = linksize.size();
		System.out.println("Total no of links Available: "+linksCount);
		links= new String[linksCount];
		System.out.println("List of links Available: ");  
		// print all the links from webpage 
		for(int i=0;i<linksCount;i++)
		{
		links[i] = linksize.get(i).getAttribute("href");
		System.out.println(all_links_webpage.get(i).getAttribute("href"));
		} 
		// navigate to each Link on the webpage
		for(int i=0;i<linksCount;i++)
		{
		driver.navigate().to(links[i]);
		Thread.sleep(3000);
		}*/
		
	/*	// load a new instance of firefox driver
		WebDriver driver = new FirefoxDriver();

		// add initial implicit wait
		driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT_4_PAGE, TimeUnit.SECONDS);

		// maximize window
		driver.manage().window().maximize();

		// navigate to www.yahoo.com
		driver.get(webpage);
		
		Thread.sleep(3000L);

		// save left links to list 
		List <WebElement> allLinks = driver.findElements(By.xpath(".//span[contains(@id,'yui_3_18_0_4_1454981472699')][contains(@class,'Va(m) ')]"));
		
		int linkCount = allLinks.size();
		
		// print links info and click 
		for(int i = 0 ; i <= linkCount ; i++){
		
			allLinks.get(i).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
		
		}*/
		//.//span[contains(@id,'yui_3_18_0_4_1454981472699')][contains(@class,'Va(m) D(tbc) Fz(14px')]
		//.//span[contains(@id,'yui_3_18_0_4_1454981472699')][contains(@class,'Va(m) ')]
	}

}
