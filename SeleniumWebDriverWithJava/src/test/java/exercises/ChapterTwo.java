package exercises;

/*
Go to our test site, the-internet, and use the findElement and findElements to complete the following scenario.
Click on the “Shifting Content” link.
Then click on the first example Menu Element.
Then print how many of these menu elements appear.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ChapterTwo {

    private WebDriver driver;

    public void testChapter2(){
       System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
       driver = new ChromeDriver();
       driver.manage().window().maximize();

       //Go to our test site
       driver.get("https://the-internet.herokuapp.com/");

       //Click on the Shifting Content
       WebElement shiftingContent = driver.findElement(By.xpath("//div/ul/li/a[@href='/shifting_content']"));
       shiftingContent.click();

       //Click on first example
       WebElement menuElement = driver.findElement(By.xpath("//div/a[@href='/shifting_content/menu']"));
       menuElement.click();

       //Then print how many of these menu elements appear
       List<WebElement> listMenuElements = driver.findElements(By.xpath("//div/ul/li"));
       System.out.println("" + listMenuElements.size());

       driver.quit();

    }

    public static void main(String args[]){
        ChapterTwo test = new ChapterTwo();
        test.testChapter2();
    }
}
