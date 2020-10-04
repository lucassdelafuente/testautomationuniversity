package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.ExecutionException;

public class BasicAuthPage {

    private WebDriver driver;
    private By txtCongrats = By.xpath("//div[@id='content']/div/p");
    private Alert alert;

    public BasicAuthPage(WebDriver driver){
        this.driver = driver;
    }

    public void completeUserAndPass(String user, String pass){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alert.sendKeys(user);
        alert.sendKeys(pass);
    }

    public void sendForm(){
        driver.switchTo().alert().accept();
    }

    public String getTextCongrats(){
        return driver.findElement(txtCongrats).getText();
    }
}
