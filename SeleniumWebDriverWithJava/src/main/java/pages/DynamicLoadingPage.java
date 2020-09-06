package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

    private WebDriver driver;
    //Because both element has the same id and properties
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));
    private By link_Example2 = By.xpath(String.format(linkXpath_Format, "Example 2"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(link_Example2).click();
        return new DynamicLoadingExample2Page(driver);
    }

    /*
Tome cualquiera de los dos, tal vez vayamos con el Ejemplo 2 y simulemos un clic derecho.
Por ejemplo, si mantuviera presionada la tecla de comando y haga clic en este enlace, se abriría en una nueva pestaña.
Es posible que también conozca otros atajos. Por lo tanto, si necesita usar las clases Keyso las Actionclases para ayudarlo, hágalo.
Después de abrir este enlace en una nueva pestaña, cambie a él y verifique que el botón "Inicio" esté allí.
 */
    public DynamicLoadingExample2Page rightClick(){
        Actions action = new Actions(driver);

        action.keyDown(Keys.COMMAND)
                .click(driver.findElement(link_Example2))
                .build()
                .perform();

        //Other solution
        //driver.findElement(link_Example2).sendKeys(Keys.CONTROL, Keys.RETURN);

        return new DynamicLoadingExample2Page(driver);
    }

}
