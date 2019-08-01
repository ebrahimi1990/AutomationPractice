package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticeWomenPage {
    /**
     * 
     * All WebElements are identified by @FindBy annotation
     * 
     */
	WebDriver driver = null;
	
	
    @FindBy(xpath="//img[@title='Blouse']")
    WebElement blouse;

    
    @FindBy(xpath="//a[@title='Blouse']/following-sibling::a[@class='quick-view']")
    WebElement blouseQuickview;

    @FindBy(className="fancybox-iframe")
    WebElement blouseIframe;

    
    public AutomationPracticeWomenPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    
    public void clickBlouseQuickview() throws InterruptedException {
		//scroll to selected item
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", blouse);
		Thread.sleep(500); 
		
		//hover mouse on item
		Actions action = new Actions(driver);
		action.moveToElement(blouse).perform();
		Thread.sleep(2000);
		blouseQuickview.click();
    }
    

}
