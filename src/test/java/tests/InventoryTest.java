package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InventoryPage;
import utils.ConfigReader;

public class InventoryTest extends BaseTest
{
    private InventoryPage page;
    private HomePage homePage;
    @BeforeMethod
    public void setup()
    {
        page = new InventoryPage(driver);
        homePage = new HomePage(driver);
//        driver.get("Saucedemo.com");
        homePage.userName.sendKeys(ConfigReader.readProperty(configFilePath, "username"));
        homePage.password.sendKeys(ConfigReader.readProperty(configFilePath, "password"));
        homePage.loginBtn.click();
    }
    @Test(testName = "US 307: Social media buttons", description = "Verify there are 3 social media buttons are present: twitter, facebook and linkedIn")
    public void test307()
    {
        String expectedTwitter = "Twitter";
        String expectedFaceBook = "Facebook";
        String expectedLinkedIn = "LinkedIn";
        page.assertEquals(page.twitterSign.getText(), expectedTwitter);
        page.assertEquals(page.facebookSign.getText(), expectedFaceBook);
        page.assertEquals(page.linkedInSign.getText(), expectedLinkedIn);
    }

}
