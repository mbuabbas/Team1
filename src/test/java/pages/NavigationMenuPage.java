package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationMenuPage extends BasePage{
    public WebDriver driver;

    public NavigationMenuPage (WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);

    }
     // TEST US 304
    @FindBy (xpath = "//button[@id='react-burger-menu-btn']") // 3 lines button
    public WebElement linesbtn;

    @FindBy(xpath = "//a[@id='inventory_sidebar_link']") //AllItems button
    public WebElement Allitems;

    @FindBy(xpath = "//a[@id='about_sidebar_link']")  //About button
    public WebElement About;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")  // Logout button
    public WebElement Logout;


    @FindBy(xpath = "//a[@id='reset_sidebar_link']")  //Reset App State button
    public WebElement ResetAppState;




}
