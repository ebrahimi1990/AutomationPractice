package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AutomationPracticeSigninPage {
	
    /**
     * 
     * All WebElements are identified by @FindBy annotation
     * 
     */
	WebDriver driver = null;
	
	
    @FindBy(id="email")
    WebElement email;

    @FindBy(id="passwd")
    WebElement password;

    @FindBy(id="SubmitLogin")
    WebElement submit;

    
    public AutomationPracticeSigninPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
        
	
	public void setEmail(String strEmail) {
		email.sendKeys(strEmail);
	}
	
	
	public void setPassword(String strPass) {
		password.sendKeys(strPass);
	}
	
	
	public void clickSignin() {
		submit.click();
	}

    
    
}