package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample1Page {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicLoadingExample1Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
        //Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loadingIndicator)));

        /* Fluent Waits give you more flexibility.
         * Each FluentWait instance defines the maximum amount of time to wait for a condition,
         * as well as the frequency with which to check the condition. Furthermore, the user may configure the wait
         * to ignore specific types of exceptions whilst waiting, such as NoSuchElementExceptions when searching for
         * an element on the page.
        FluentWait wait = new FluentWait(driver)
            .withTimeout(Duration.ofSeconds(5))
            .pollingEvery(Duration.ofSeconds(1))
            .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.invisibilityOf(
        driver.findElement(loadingIndicator)));
         */
    }

    public String getLoadedText(){
        return  driver.findElement(loadedText).getText();
    }


}
