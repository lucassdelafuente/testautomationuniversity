package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.stream.Collectors;

public class DropDownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");
    private By option1 = By.cssSelector("#dropdown option[value='1']");
    private By option2 = By.cssSelector("#dropdown option[value='2']");

    //Constructor
    public DropDownPage(WebDriver driver){

        this.driver = driver;
    }

    //Find element
    private Select findDropDownElement(){

        return new Select(driver.findElement(dropdown));
    }

    //Get All options
    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();

        /*Classic approach
        List<String> options = new LinkedList<>();
        for(WebElement e: selectedElements){

            String element = e.getText();
            options.add(element);

        }
        System.out.println(options);
        return options;
        */

        //Modern approach
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    //By Visible text with parameter
    public void selectFromDropDown(String option){
        //Use the "Select" Class that is a "support-selenium" Class.
        findDropDownElement().selectByVisibleText(option);
    }

    //Select both options with JavaScript
    public void selectBothOptions(){
        String script = "arguments[0].setAttribute('multiple','')";
        ((JavascriptExecutor)driver).executeScript(script, findDropDownElement());
    }

}
