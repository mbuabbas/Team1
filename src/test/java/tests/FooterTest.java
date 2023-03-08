package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FooterPage;
import utils.ConfigReader;

public class FooterTest extends BaseTest {

    private FooterPage page;

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

      Assert.assertTrue(expected.equals(actual));


}

}

