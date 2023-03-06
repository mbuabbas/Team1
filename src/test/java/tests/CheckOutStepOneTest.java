package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckOutStepOnePage;
import pages.HomePage;
import pages.InventoryPage;
import utils.ConfigReader;

public class CheckOutStepOneTest extends BaseTest
{
    private CheckOutStepOnePage page;
    private HomePage homePage;
    private InventoryPage inventoryPage;
    @BeforeMethod
    public void setup()
    {
        page = new CheckOutStepOnePage(driver);
        homePage = new HomePage(driver);
        inventoryPage = new InventoryPage(driver);
        homePage.userName.sendKeys(ConfigReader.readProperty(configFilePath, "username"));
        homePage.password.sendKeys(ConfigReader.readProperty(configFilePath, "password"));
        homePage.loginBtn.click();
        inventoryPage.shoppingCartLink.click();
    }

    @Test(testName = "US 308 - Checkout: Your Information",
            description = "Checkout form should have following fields displayed where user can input their details: First Name, Last Name, Zip/Postal Code")
    public void test308()
    {
        String expectedFirstNameText = "First Name";
        String expectedLastNameText = "Last Name";
        String expectedPostalText = "Zip/Postal Code";
        page.checkoutBtn.click();
        String firstNameTextBox = page.firstNameField.getAttribute("placeholder");
        String lastNameTextBox = page.lastNameField.getAttribute("placeholder");
        String postalCodeTextBox = page.postalCodeField.getAttribute("placeholder");
        page.assertEquals(firstNameTextBox, expectedFirstNameText);
        page.assertEquals(lastNameTextBox, expectedLastNameText);
        page.assertEquals(postalCodeTextBox, expectedPostalText);
    }
}
