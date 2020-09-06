package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By box = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnBox(){
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(box)).perform();
    }

    public String textInModal(){
        return driver.switchTo().alert().getText();
    }

    public void clickOnAcept(){
        driver.switchTo().alert().accept();
    }


}
