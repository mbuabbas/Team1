package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends BasePage
{
    private WebDriver driver;
    public InventoryPage (WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='https://twitter.com/saucelabs']")
    public WebElement twitterSign;
    @FindBy(xpath = "//a[@href='https://www.facebook.com/saucelabs']")
    public WebElement facebookSign;
    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/sauce-labs/']")
    public WebElement linkedInSign;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement shoppingCartLink;

}
