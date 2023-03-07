package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProblemUserPage extends BasePage {
    public WebDriver driver;

    public ProblemUserPage(WebDriver driver){

        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement username1;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password1;
    @FindBy(id = "login-button")
    public WebElement loginBtn1;



    @FindBy(xpath = "//img[@alt='Sauce Labs Backpack']")
    public WebElement photo;


}
