package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProblemUserPage;
import utils.ConfigReader;

public class ProblemUserTest extends BaseTest {

    private ProblemUserPage page;




    @BeforeMethod
    public void setup() {

        page = new ProblemUserPage(driver);

        driver.get("https://www.saucedemo.com");



    }

    @Test (testName = "US303" )
    public void test304(){

        page.username1.sendKeys("problem_user");
        page.password1.sendKeys("secret_sauce");
        page.loginBtn1.click();










    }

}