package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProblemUserPage;
import utils.ConfigReader;

public class ProblemUserTest extends BaseTest {

    private ProblemUserTest page;

    private HomePage homePage;

    public ProblemUserTest(WebDriver driver) {

    }


    @BeforeMethod
    public void setup() {

        page = new ProblemUserTest(driver);
        homePage = new HomePage(driver);
        driver.get("https://www.saucedemo.com");
        homePage.userName.sendKeys(ConfigReader.readProperty(configFilePath, "username"));
        homePage.password.sendKeys(ConfigReader.readProperty(configFilePath, "password"));
        page.homePage.loginBtn.click();

    }

    @Test (testName = "US303" )
    public void test304(){
        driver.get("https://www.saucedemo.com");





    }

}