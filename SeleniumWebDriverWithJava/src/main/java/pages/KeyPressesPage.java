package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public void enterPi(){
        //Chord method allow you send a multiple keys at the same time
        enterText(Keys.chord(Keys.ALT, "p") + "=3.14");
    }

    public String getResult(){

        return driver.findElement(resultText).getText();
    }

}
