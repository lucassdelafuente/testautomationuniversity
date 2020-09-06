package pages;

/*
Dynamic Loading page from the application home page
And this time click “Example 2” where the element is rendered after the fact
Click on the “Start” button
This looks like a similar scenario to the one we've done. However, this text is not in the DOM until the loading indicator has disappeared.
So, figure out what's the best strategy to use for this scenario.
But the catch is I want you to wait until this “Hello World!” is available. So, I don't want you to use the waiting strategy on the loading indicator, but on this text itself.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample2Page {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadedText = By.id("finish");

    public DynamicLoadingExample2Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
        //Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }

    public String getLoadedText(){

        return  driver.findElement(loadedText).getText();
    }

    public boolean startButtonIsDisplayed(){
        return driver.findElement(startButton).isDisplayed();
    }

}
