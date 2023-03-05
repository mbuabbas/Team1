package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class footerPage extends BasePage{

    public footerPage(WebDriver driver){
      //  super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "footer_copy")
    public WebElement title;

}
