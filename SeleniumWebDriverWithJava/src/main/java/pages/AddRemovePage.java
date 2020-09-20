package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

public class AddRemovePage {

    private WebDriver driver;
    private By addElement = By.xpath("//div[@class='example']/button");
    private By removeElement = By.xpath("//div[@id='elements']/button");

    public AddRemovePage(WebDriver driver){

        this.driver = driver;
    }

    public void addElement(int clicks){
        for(int i=1;i<=clicks;i++){
            driver.findElement(addElement).click();
        }
    }

    public void removeElement(int quantityRemove){

       List<WebElement> removeBtn = driver.findElements(removeElement);
       for(int i=1;i<=quantityRemove;i++){
           removeBtn.get(i-1).click();
        }
    }

    public boolean validateRemoveElement(){
        List<WebElement> removeBtn = driver.findElements(removeElement);

        if(!removeBtn.isEmpty()){
            return false;
        }else{
            return true;
        }
    }

}
