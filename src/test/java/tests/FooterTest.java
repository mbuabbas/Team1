package tests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FooterPage;
import pages.HomePage;
import utils.ConfigReader;

import java.security.PublicKey;

public class FooterTest extends BaseTest {

    private FooterPage page;
    //private HomePage homePage;

@BeforeMethod
    public void setUp(){

    page = new FooterPage(driver);
    driver.get("https://www.saucedemo.com");
    FooterPage.userName.sendKeys(ConfigReader.readProperty(configFilePath, "username"));
    FooterPage.password.sendKeys(ConfigReader.readProperty(configFilePath, "password"));
    FooterPage.loginBtn.click();
}

@Test(testName = " US305: Footer of the page should be © 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy")
    public void test305(){

    String expected = "© 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
    String actual = page.footer.getText();

      Assert.assertEquals(expected, actual);


      //page.isDisplayed(page.footer);
}

}

// it's going to fail because the copy right were updated on the website to 2023 but the user story asked to check for 2022.
