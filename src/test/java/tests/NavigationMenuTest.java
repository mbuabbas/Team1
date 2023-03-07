package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NavigationMenuPage;
import utils.ConfigReader;

import java.security.PublicKey;

public class NavigationMenuTest extends BaseTest {

    private NavigationMenuPage page;

    private HomePage homePage;

    @BeforeMethod
    public void setup() {
        page = new NavigationMenuPage(driver);
        homePage = new HomePage(driver);
        homePage.userName.sendKeys(ConfigReader.readProperty(configFilePath, "username"));
        homePage.password.sendKeys(ConfigReader.readProperty(configFilePath, "password"));
        homePage.loginBtn.click();
        page.linesbtn.click();

    }

    @Test(testName = "US 304", description = "When user clicks the button it should display following buttons:" +
            "allItems,Logout,About,Reset App state")
    public void test304() {

        page.isDisplayed(page.Allitems);
        page.isDisplayed(page.About);
        page.isDisplayed(page.Logout);
        page.isDisplayed(page.ResetAppState);

    }




        }



















