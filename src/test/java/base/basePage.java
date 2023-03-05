package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
    protected WebDriver driver;

    public basePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void sleep(Long milliSeconds){
        try{
            Thread.sleep(milliSeconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void click(WebElement element){
        waitForElementClickability(element);
        moveElementToTheMiddleOfView(element);
        highlightElement(element);
        element.click();
    }

    public void isDisplayed(WebElement element){
        waitForElementClickability(element);
        moveElementToTheMiddleOfView(element);
        highlightElement(element);
        element.isDisplayed();

    }
    public void isEnabled(WebElement element){
        waitForElementClickability(element);
        moveElementToTheMiddleOfView(element);
        highlightElement(element);
        element.isEnabled();

    }

    public void sendKeys(WebElement element, String inputText){
        waitForElementVisibility(element);
        moveElementToTheMiddleOfView(element);
        highlightElement(element);
        element.sendKeys(inputText);
    }

    public String getText(WebElement element){
        waitForElementVisibility(element);
        moveElementToTheMiddleOfView(element);
        highlightElement(element);
        return element.getText();
    }

    public void waitForElementClickability(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void moveIntoView(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);

    }

    public void highlightElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for(int i = 0; i < 4; i++){
            try{
                if(i % 2 == 0){
                    js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: black;" +
                            "border: 3px solid red; background: yellow");
                }else {
                    sleep(500L);
                    js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    public void clickWithoutMoving(WebElement element){
        waitForElementClickability(element);
        highlightElement(element);
        element.click();
    }
    public void moveElementToTheMiddleOfView(WebElement element) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", element);
    }
}

