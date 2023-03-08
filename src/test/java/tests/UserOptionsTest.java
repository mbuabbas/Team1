package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FooterPage;
import pages.UserOptionsPage;
import utils.ConfigReader;

import java.util.Arrays;
import java.util.List;

public class UserOptionsTest extends BaseTest{

    private UserOptionsPage page;

    @BeforeMethod
    public void setUp() {
        page = new UserOptionsPage(driver);
        driver.get("https://www.saucedemo.com");
        UserOptionsPage.userName.sendKeys(ConfigReader.readProperty(configFilePath, "username"));
        UserOptionsPage.password.sendKeys(ConfigReader.readProperty(configFilePath, "password"));
        UserOptionsPage.loginBtn.click();
    }
    @Test(testName = "US306: Filter options. When user clicks the filter it should have the options")
    public void test306() throws InterruptedException {
        page.options.click();
        Select select = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));


        List<WebElement> allOptions = select.getOptions();
        boolean allOptionsSame = true;
        List<String> expectedOptionTexts = Arrays.asList("Name (A to Z)", "Name (Z to A)", "Price (low to high)", "Price (high to low)");

        if (allOptions.size() != expectedOptionTexts.size()) {
            allOptionsSame = false;
        } else {
            for (int i = 0; i < allOptions.size(); i++) {
                if (!allOptions.get(i).getText().equals(expectedOptionTexts.get(i))) {
                    allOptionsSame = false;
                    break;
                }
            }
        }

        if (allOptionsSame) {
            System.out.println("options are the same as the expected texts.");
        } else {
            System.out.println("options are not the same as the expected texts.");
        }






    }

    }
