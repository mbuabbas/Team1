package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.ConfigReader;

public class ProblemUserTest extends BaseTest {

    private ProblemUserTest page;

    private HomePage homePage;

    public ProblemUserTest(WebDriver driver) {

    }


    @BeforeMethod
    public void setup() {
        page = new ProblemUserTest(driver);
        homePage.userName.sendKeys(ConfigReader.readProperty(configFilePath, "username"));
        homePage.password.sendKeys(ConfigReader.readProperty(configFilePath, "password"));
        homePage.loginBtn.click();

    }

    @Test (testName = "US303" )
    public void test304(){










    }

}