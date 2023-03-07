package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import pages.BasePage;


        public class LoginPage extends BasePage {
            private WebDriver driver;

            public LoginPage(WebDriver driver) {
                super(driver);
                PageFactory.initElements(driver, this);
                this.driver = driver;
            }

            @FindBy(id = "username")
            public WebElement usernameField;
            @FindBy(id = "password")
            public WebElement passwordField;
            @FindBy(id = "login-button")
            public WebElement signInBtn;

            @FindBy(xpath = "//h3[@data-test='error']")
            public WebElement signInError;
            public void signIn(String username, String password) {
                usernameField.sendKeys(username);
                passwordField.sendKeys(password);
                signInBtn.click();
            }
        }

