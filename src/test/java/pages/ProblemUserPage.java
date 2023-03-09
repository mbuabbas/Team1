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

// ---------------------------------------------------------------------------------------

    @FindBy(xpath = "//a[@id='item_0_img_link']/img")
     public WebElement photo0;

    @FindBy(xpath ="//a[@id='item_1_img_link']/img " )
    public WebElement photo1;

    @FindBy(xpath = "//a[@id='item_5_img_link']/img")
    public WebElement photo2;

    @FindBy(xpath = "//a[@id='item_2_img_link']/img")
    public WebElement photo3;


    @FindBy(xpath = "//a[@id='item_4_img_link']/img")
    public WebElement photo4;

    @FindBy(xpath = "//a[@id='item_3_img_link']/img")
    public WebElement photo5;


}
