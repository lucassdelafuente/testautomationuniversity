package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenImagesPage {

    private WebDriver driver;
    private int count;

    public BrokenImagesPage(WebDriver driver){
        this.driver = driver;
    }

    public int countImgBroken()
    {
        List<WebElement> listImg = driver.findElements(By.xpath("//div[@class='example']/img"));
        System.out.println("Total number of images on webpage: " + listImg.size());

        for(WebElement img : listImg){
            try{
                HttpURLConnection connection = (HttpURLConnection) new URL(img.getAttribute("src")).openConnection();
                connection.setRequestMethod("GET");
                int responseCode = connection.getResponseCode();
                if(responseCode != 200){
                    System.out.println("Broken image: " + img.getAttribute("src"));
                } else{
                    count = count+1;
                    System.out.println("Fine image: " + img.getAttribute("src"));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return count;
    }

    public boolean checkBroken(){
        if (count == 0){
            return true;
        } else{
            return false;
        }
    }

}
