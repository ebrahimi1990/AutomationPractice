package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.AutomationPracticeBlouseQuickvew;
import pages.AutomationPracticeWomenPage;


public class QuickViewTest {

	
	private static WebDriver driver = null;

	@Test(groups="quickview")
	public static void open_quickview() throws InterruptedException {
	
		driver = new FirefoxDriver();
		AutomationPracticeWomenPage WomenObj = new AutomationPracticeWomenPage(driver);

		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
		WomenObj.clickBlouseQuickview();
		
		driver.close();
	}
	
	
	@Test(groups="quickview")
	public static void add_to_card() throws InterruptedException {
	
		driver = new FirefoxDriver();
		AutomationPracticeWomenPage WomenObj = new AutomationPracticeWomenPage(driver);

		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
		WomenObj.clickBlouseQuickview();
		driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")));
		Thread.sleep(5000);
		
		AutomationPracticeBlouseQuickvew QuickObj = new AutomationPracticeBlouseQuickvew(driver);
		QuickObj.increase_quantity();
		driver.close();
	}

}
