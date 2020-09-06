package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassPage {

    private WebDriver driver;
    private By txtEmail = By.id("email");
    private By btnRetrieve = By.id("form_submit");
    private String email;

    public ForgotPassPage(WebDriver driver){
        this.driver = driver;
    }

    public void completeField(String email){
        driver.findElement(txtEmail).sendKeys(email);
    }

    public EmailSentPage clickRetrieve(){
        driver.findElement(btnRetrieve).click();

        return new EmailSentPage(driver);
    }
}
