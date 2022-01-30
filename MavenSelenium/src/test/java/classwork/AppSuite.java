package classwork;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppSuite {
public WebDriver driver;
	
	@Test(priority=1)
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Madhavi\\software\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url+"\t" +title);
	}
	@Test(priority=3)
	public void navigateHome() {
		driver.findElement(By.xpath("//img[@alt='My Store']")).click();
	}
	@Test(priority=2)
	public void searchDress() {
		String searchinput = "//input[@name='search_query']";
		String searchBtn = "//button[@name='submit_search']";
		driver.findElement(By.xpath(searchinput)).click();
		driver.findElement(By.xpath(searchinput)).sendKeys("Summer dresses");
		//testing output 1
		//testing output 2
		//testingoutut 3
		
		driver.findElement(By.xpath(searchBtn)).click();
	}
	
	@Test(priority=4)
	public void quitBrowser() {
		driver.quit();
	}
	
}
