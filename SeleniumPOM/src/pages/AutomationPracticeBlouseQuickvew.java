package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticeBlouseQuickvew {
    /**
     * 
     * All WebElements are identified by @FindBy annotation
     * 
     */
	WebDriver driver = null;
	
	
    @FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']")
    WebElement plus;

    
    public AutomationPracticeBlouseQuickvew(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    
    public void increase_quantity() {
    	plus.click();
    }
    
}
