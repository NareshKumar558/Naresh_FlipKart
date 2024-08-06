package demo.wrappers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Wrappers {

    
    /*
     * Write your selenium wrappers here
     */

     public WebDriver driver;
     public WebDriverWait wait;

    public void waitForElement(By locator){
        wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public Wrappers(WebDriver driver){
        this.driver=driver;
    }
    public WebElement searchElement(String x){
        //return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        return driver.findElement(By.xpath(x));
    }
    public WebElement searchChildElement(WebElement input, String x){
        return input.findElement(By.xpath(x));
    }

    public void sendKeysInput(String x, String y){
        driver.findElement(By.className(x)).sendKeys(y, Keys.ENTER);
    }
    public void sendInput(WebElement input, String x){        
        input.clear();
        //wait.wait(2000);
        input.sendKeys(x);
    }
    public void clickElement(WebElement input){
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(input))).click();
        input.click();
    }
    public int searchElements(String x){
        List<WebElement> count=driver.findElements(By.xpath(x));
        System.out.println(count.size());
        int a=0;
        for(WebElement y:count){
            float z=Float.parseFloat(y.getText());
            if(z<=4.0){
                a++;
            }
        }
        return a;
    }
    public List<WebElement> searchElements2(String x){
        return driver.findElements(By.xpath(x));
    }
    public void clearText(WebElement input){
        input.clear();
    }

}
