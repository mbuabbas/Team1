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


        String SauceLab0 = page.photo0.getAttribute("src");
        System.out.println("this is name "+ SauceLab0);

        String SauceLab1= page.photo1.getAttribute("src");
        System.out.println("this is name "+ SauceLab1);

        String Saucelab2 = page.photo2.getAttribute("src");
        System.out.println("this is name "+ Saucelab2);

        String SauceLab3 = page.photo3.getAttribute("src");
        System.out.println("this is name  " + SauceLab3);

        String SauceLab4 = page.photo4.getAttribute("src");
        System.out.println("this is name "+ SauceLab4);

        String SauceLab5 = page.photo5.getAttribute("src");
        System.out.println("this is name "+ SauceLab5);











    }

}