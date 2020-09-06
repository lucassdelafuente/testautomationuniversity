package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {

    WebDriver driver;
    private By txtContent = By.id("content");

    public EmailSentPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTextContent(){
        return driver.findElement(txtContent).getText();

    }
}
