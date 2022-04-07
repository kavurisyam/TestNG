package CrossBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParametersExample {
		
	 
	WebDriver driver;
	 
		@BeforeClass
		@Parameters({"browser","url"})
		void setup(String browser, String app) throws InterruptedException {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:/Softwares/Selenium/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.chrome.driver", "D:/Softwares/Selenium/chromedriver.exe");
				driver = new FirefoxDriver();
				
			}
		
		driver.get(app);
		Thread.sleep(10000);
			
	}
	 
	 @Test(priority=1)
	 void logoTest() {
		 WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		 Assert.assertTrue(logo.isDisplayed(),"Logo not displayed on the page");

	 }
	 
	 @Test(priority=2)
	 void homePageTitle() {
		String title = driver.getTitle();
		Assert.assertEquals( title,"OrangeHRM","Title is not matched");
	 }
	 
	 @AfterClass
	 void tearDown() {
		 driver.quit();
	 }

}
