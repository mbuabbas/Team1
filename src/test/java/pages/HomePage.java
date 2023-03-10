package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
    public HomePage (WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "user-name")
    public WebElement userName;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "login-button")
    public WebElement loginBtn;




}
