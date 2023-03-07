package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;

public class UserOptionsPage extends BasePage {

    public UserOptionsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "user-name")
    public static WebElement userName;
    @FindBy(id = "password")
    public static WebElement password;
    @FindBy(id = "login-button")
    public static WebElement loginBtn;
    @FindBy(className = "product_sort_container")
    public static WebElement options;

}
