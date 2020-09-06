package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Set;

public class WindowsManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowsManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
        //or if you don't declare the navigate = driver.navigate() you can use:
        //driver.navigate().back
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }

    public void switchToTab(String tabTitle){
        Set<String> windows = driver.getWindowHandles();

        System.out.println("Number of tabs: " + windows.size());
        windows.forEach(System.out::println);

        for(String window : windows){
            System.out.println("Switching to windows: " + window);
            driver.switchTo().window(window);

            System.out.println("Current windows title: " + driver.getTitle());

            //To know if the current tab is the indicate by params
            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }

    public void switchToOtherTab(){
        ArrayList tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));

        //Other solution
        //var windows = driver.getWindowHandles();
        //windows.forEach(driver.switchTo()::window);

        //Other
        //Open a new tab using Ctrl + t
        // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
        //Switch between tabs using Ctrl + \t
        // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");

        //Other
        // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "1");
        //# goes to 1st tab
    }
}
