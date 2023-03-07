package tests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.ConfigReader;

    public class LoginTest extends BaseTest{
        private LoginPage page;

        @BeforeMethod
        public void setUp(){
            page= new LoginPage(driver);

        }
        @Test(testName="US 301 - Verify standard_user can login with right password")
        public void test301(){
            page.usernameField.sendKeys("standart_user");
            page.passwordField.sendKeys("secret_sauce");
            page.signInBtn.click();
        }
            @Test(testName = "US 302- When locked out user tries to login with right password I would like to see an error message")
        public void test302(){
                page.usernameField.sendKeys("locked_out_user");
                page.passwordField.sendKeys("secret_sauce");
                page.signInBtn.click();
                String massage= "Epic sadface: Sorry, this user has been locked out.";


                String actualText= page.getText(page.signInError);
                Assert.assertEquals(actualText,massage);
        }
    }




