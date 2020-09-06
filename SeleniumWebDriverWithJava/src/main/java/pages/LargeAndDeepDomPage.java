package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {

    private WebDriver driver;
    private By table = By.id("large-table");

     public LargeAndDeepDomPage(WebDriver driver){
         this.driver = driver;
     }

     //Yo use JS for move with scroll
    public void scrollToTable(){
        WebElement tableElement = driver.findElement(table);
        //Java Script Method
        String script = "arguments[0].scrollIntoView();";
        //Cast the driver to JSExecutor
        ((JavascriptExecutor)driver).executeScript(script, tableElement);

    }
}
