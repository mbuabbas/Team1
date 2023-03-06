package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepOnePage extends BasePage
{
    private WebDriver driver;
    public CheckOutStepOnePage (WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "checkout")
    public WebElement checkoutBtn;
    @FindBy(id = "first-name")
    public WebElement firstNameField;
    @FindBy(id = "last-name")
    public WebElement lastNameField;
    @FindBy(id = "postal-code")
    public WebElement postalCodeField;
}
