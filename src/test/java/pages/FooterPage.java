package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage extends BasePage{

    public FooterPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "user-name")
    public static WebElement userName;
    @FindBy(id = "password")
    public static WebElement password;
    @FindBy(id = "login-button")
    public static WebElement loginBtn;
    @FindBy(className = "footer_copy")
    public WebElement footer;

}
