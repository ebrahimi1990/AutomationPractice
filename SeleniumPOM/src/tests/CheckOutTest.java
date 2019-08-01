package tests;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.AutomationPracticeHomePage;
import pages.AutomationPracticeBlousePage;


public class CheckOutTest {

	private static WebDriver driver = null;
	
	
	// check if the shopping card is empty
	@Test
	public void empty_cart() {
		
		driver = new FirefoxDriver();
		AutomationPracticeHomePage HomePageObj = new AutomationPracticeHomePage(driver);
		
		driver.get("http://automationpractice.com");
		HomePageObj.clickShoppingCart();
		
		assertTrue(driver.getPageSource().contains("shopping cart is empty"));
		driver.close();
	}
	
	
	@Test
	public void Shop_Women_001() throws InterruptedException {
		
		driver = new FirefoxDriver();
		AutomationPracticeHomePage HomePageObj = new AutomationPracticeHomePage(driver);
		
		driver.get("http://automationpractice.com");
		
		AutomationPracticeBlousePage BlouseObj = new AutomationPracticeBlousePage(driver);
		
		HomePageObj.clickWomen();
		driver.findElement(By.xpath("//a[@class='product-name' and @title='Blouse']")).click();
		BlouseObj.btnIncreaseQuantity();
		BlouseObj.addToCart();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("layer_cart")));
		driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
		
	}

}
