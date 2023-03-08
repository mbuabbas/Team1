package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemsPage extends BasePage {

    private WebDriver driver;
    public ItemsPage (WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCartBtn;

//    @FindBy(id= "add-to-cart-sauce-labs-bolt-t-shirt")
//    public WebElement getAddToCartBtn2;

    @FindBy(id = "shopping_cart_container")
    public WebElement cartElementWithItem;

    @FindBy(name= "remove-sauce-labs-backpack")
    public WebElement removeBtn;

    @FindBy(className = "shopping_cart_link")
    public WebElement shoppingCrt;

}
