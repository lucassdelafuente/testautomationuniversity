package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.CookieManager;
import utils.EventReporter;
import utils.WindowsManager;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class BaseTest {
    //Selenium Class, specific instance of Web Driver
    //private EventFiringWebDriver driver;
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        //Code for EventFiringWebDriver
        //driver = new EventFiringWebDriver(new ChromeDriver());
        //driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        //driver.register(new EventReporter());

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Bad example
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        goHome();
        setCookie();

        //List<WebElement> links = driver.findElements(By.tagName("a"));
        //System.out.println(links.size());

        //WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        //inputsLink.click();

        //driver.manage().windows().setSize(new Dimension(375,812));
        //System.out.println(driver.getTitle());
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    /* Simple TakeScreenshot.
    @AfterMethod
    public void takeScreenshot(){
        //Use TakeScreenshot Selenium Class
        TakesScreenshot camera = (TakesScreenshot)driver;
        //Use File Java Class
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        //Move File to inside the Project
        try{
            //Files is from Google
            Files.move(screenshot, new File("resources/screenshots/test.png"));
        }catch(IOException e){
            e.printStackTrace();
        }

        //Path when screenshot is stored
        //System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
    }*/

    //ITestResult is a TESTNG Class
    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus()){
            TakesScreenshot camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public WindowsManager getWindowsManager(){
        return new WindowsManager(driver);
    }

    public CookieManager getCookieManager(){
        return new CookieManager(driver);
    }

    //It is a selenium package
    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        //Whitout Open the Browser
        // *options.setHeadless(true);
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }

    public void deleteCookie(String cookie){
        Set<Cookie> cookies = driver.manage().getCookies();

        for(Cookie element : cookies){
            String nameCookie = element.getName();
            if(nameCookie.equals(cookie)){
                driver.manage().deleteCookieNamed(cookie);
                break;
            }
        }
    }

}
