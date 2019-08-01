package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AutomationPracticeSigninPage;
import pages.AutomationPracticeHomePage;

public class SignInTest {

	private static WebDriver driver = null;
	
	
	@BeforeTest
	public static void Before() {
		
	}
	
	
	
	@Test(priority=1, groups="Signin")
	public static void Login_N_001() {
		
		driver = new FirefoxDriver();
		
		AutomationPracticeSigninPage signinPageObj = new AutomationPracticeSigninPage(driver);
		AutomationPracticeHomePage HomePageObj = new AutomationPracticeHomePage(driver);
		
		driver.get("http://automationpractice.com");
		
		//go to Login Page from Home Page
		HomePageObj.clickLogin();
		
		signinPageObj.setEmail("tester3000@outlook.com");
		signinPageObj.setPassword("falsepass");
		signinPageObj.clickSignin();
		
		driver.close();
	}
	
	
	@Test(priority=2, groups="Signin")
	public static void Login_N_002() {
		
		driver = new FirefoxDriver();
		AutomationPracticeSigninPage signinPageObj = new AutomationPracticeSigninPage(driver);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		signinPageObj.setEmail(" ");
		signinPageObj.setPassword(" ");
		signinPageObj.clickSignin();
		
		driver.close();
	}
	
	
	
	//--------------------------------- Log in -----------------------------------
	@Test(priority=3, groups="Signin")
	public static void Login_P_001() {
		
		driver = new FirefoxDriver();
		AutomationPracticeSigninPage signinPageObj = new AutomationPracticeSigninPage(driver);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		signinPageObj.setEmail("tester3000@outlook.com");
		signinPageObj.setPassword("1234567");
		signinPageObj.clickSignin();
		
		driver.close();
	}
	
}
