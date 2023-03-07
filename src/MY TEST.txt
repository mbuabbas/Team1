package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InventoryPage;
import pages.ItemsPage;
import utils.ConfigReader;

public class ItemsTest extends BaseTest {

    private ItemsPage page;
    private HomePage homePage;

    @BeforeMethod
    public void setup() {
        page = new ItemsPage(driver);
        homePage = new HomePage(driver);
        homePage.userName.sendKeys(ConfigReader.readProperty(configFilePath, "username"));
        homePage.password.sendKeys(ConfigReader.readProperty(configFilePath, "password"));
        homePage.loginBtn.click();
    }

    @Test(testName = "US309: Add to cart", description = "Verify that user is able to add the items to the cart and they displayed in the cart view")
    public void test309() {

        page.addToCartBtn.click();
        Assert.assertTrue(page.cartElementWithItem.isDisplayed());

    }

    @Test(testName = "US310: Remove from cart", description = "User should be able to remove added item from the cart with a click of a button")
    public void test310() {
        page.addToCartBtn.click();
        page.removeBtn.click();
        Assert.assertNull(page.shoppingCrt.getAttribute("Cart is empty"));



    }
}



