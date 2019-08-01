package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AutomationPracticeHomePage {
		
	
    /**
     * 
     * All WebElements are identified by @FindBy annotation
     * 
     */
	WebDriver driver = null;
	
    @FindBy(css=".login")
    WebElement logIn;

    @FindBy(css=".login")
    WebElement logOut;
    
    @FindBy(xpath="//a[@title='Women']")
    WebElement womenTab;

    @FindBy(id="search_query_top")
    WebElement txtboxSearch;

    @FindBy(xpath="//button[@name='submit_search']")
    WebElement btnSearch;
    
    @FindBy(xpath="//a[@title='View my shopping cart']")
    WebElement cart;
    
    
    public AutomationPracticeHomePage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
	
	
    public void clickLogin() {
    	logIn.click();
    }
	
    
    public void clickLogOut() {
    	logOut.click();
    }

    
    public void clickWomen() {
    	womenTab.click();
    }

    
    public void searchTxt(String strSearch) {
    	txtboxSearch.clear();
    	txtboxSearch.sendKeys(strSearch);
    }


    public void clickSearch() {
    	btnSearch.click();
    }
    
    
    public void clickShoppingCart() {
    	cart.click();
    }

}
