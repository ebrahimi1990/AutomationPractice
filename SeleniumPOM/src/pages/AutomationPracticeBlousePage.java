package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticeBlousePage {
	
    /**
     * 
     * All WebElements are identified by @FindBy annotation
     * 
     */
	WebDriver driver = null;
	
	
    @FindBy(xpath="//p[@id='add_to_cart']//button[@type='submit']")
    WebElement addto;

    @FindBy(id="quantity_wanted")
    WebElement txtQuantity;
    
    @FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']")
    WebElement incraseQuantity;

    @FindBy(xpath="//a[@class='btn btn-default button-minus product_quantity_down']")
    WebElement decreaseQuantity;

    @FindBy(id="uniform-group_1")
    WebElement dropdownSize;


    
    public AutomationPracticeBlousePage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    

    //---------------------------- Functionalities ----------------------------
    
    public void addToCart() {
    	addto.click();
    }
    
    
    // Insert a number for quantity in blouse page
    public void txtboxQuantity(String strNum) {
    	txtQuantity.clear();
    	txtQuantity.sendKeys(strNum);
    }
    
    
    // Increases the quantity in blouse page
    public void btnIncreaseQuantity() {
    	incraseQuantity.click();
    }
    
    
    // Decrease the quantity in blouse page
    public void btndecreaseQuantity() {
    	decreaseQuantity.click();
    }
    
    
    // Select size from drop down
    public void selectDropdown(String strSize) {
    	Select dropdown = new Select(dropdownSize);
    	dropdown.selectByVisibleText(strSize);
    }

}
