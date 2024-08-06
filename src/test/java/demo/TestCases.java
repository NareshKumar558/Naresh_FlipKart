package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

// import io.github.bonigarcia.wdm.WebDriverManager;
import demo.wrappers.Wrappers;

public class TestCases {
    ChromeDriver driver;
    public Wrappers wrappers;
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));

    /*
     * TODO: Write your tests here with testng @Test annotation.
     * Follow `testCase01` `testCase02`... format or what is provided in
     * instructions
     */
    @Test
    public void testCase01() {
        try {
            System.out.println("Start Test case: testCase01");
            driver.get("http://www.flipkart.com");
            //Thread.sleep(3000);

            // searchbar
            wrappers.waitForElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
            WebElement searchbar = wrappers.searchElement("//input[@title='Search for Products, Brands and More']");
            // send input
            wrappers.sendInput(searchbar, "Washing Machine");

            // SearchIcon
            wrappers.waitForElement(By.xpath("//button[@title='Search for Products, Brands and More']"));
            WebElement SearchIcon = wrappers.searchElement("//button[@title='Search for Products, Brands and More']");
            // click
            wrappers.clickElement(SearchIcon);

            //wait.wait(6000);

            //Thread.sleep(6000);

            // popularity
            wrappers.waitForElement(By.xpath("//div[text()='Popularity']"));
            WebElement popularity = wrappers.searchElement("//div[text()='Popularity']");
            // click
            wrappers.clickElement(popularity);

            Thread.sleep(3000);

            // countOf4
            int count = wrappers.searchElements("//div[@class='XQDdHH']");
            System.out.println("Count of 4 or less is: " + count);

            

            


            System.out.println("End Test case: testCase01");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("TestCase01 Failed!");
        }

    }

        @Test
        public void testCase02(){
            try{
                System.out.println("Start Test case: testCase02");

                // remove washing machine
                wrappers.waitForElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
                WebElement remove = wrappers.searchElement("//input[@placeholder='Search for products, brands and more']");
                wrappers.clickElement(remove);
                Thread.sleep(2000);
                wrappers.sendInput(remove, "iPhone");

                // newSearchIcon
                wrappers.waitForElement(By.xpath("//button[@class='MJG8Up']"));
                WebElement newSearchIcon = wrappers.searchElement("//button[@class='MJG8Up']");
                // click
                Thread.sleep(2000);
                wrappers.clickElement(newSearchIcon);

                Thread.sleep(5000);

                //iphoneTitle
                wrappers.waitForElement(By.xpath("//div[@class='KzDlHZ']"));
                List<WebElement> iphoneTitle=wrappers.searchElements2("//div[@class='KzDlHZ']");
                for(WebElement title:iphoneTitle){
                   System.out.println(title.getText());
                }
                //discount
                wrappers.waitForElement(By.xpath("//div[@class='UkUFwK']/span"));
                List<WebElement> discount=wrappers.searchElements2("//div[@class='UkUFwK']/span");
                for(WebElement discountIphone:discount){
                   System.out.println(discountIphone.getText());
                }
                Thread.sleep(3000);
                System.out.println("End Test case: testCase02");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("TestCase02 Failed!");
            }
            
        }


        @Test
        public void testCase03(){
            try{
                System.out.println("Start Test case: testCase03");

                // remove iphone
                wrappers.waitForElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
                WebElement remove_iphone = wrappers.searchElement("//input[@placeholder='Search for products, brands and more']");
                wrappers.clickElement(remove_iphone);
                Thread.sleep(2000);
                wrappers.sendInput(remove_iphone, "Coffee Mug");

                // newSearchIconIphone
                wrappers.waitForElement(By.xpath("//button[@class='MJG8Up']"));
                WebElement newSearchIconIphone = wrappers.searchElement("//button[@class='MJG8Up']");
                // click
                Thread.sleep(2000);
                wrappers.clickElement(newSearchIconIphone);

                Thread.sleep(5000);

                //select 4 star
                //*[@id='container']/div/div[3]/div[1]/div[1]/div/div/div/section[5]/div[2]/div/div[1]/div/label/input
                WebElement fourStar=wrappers.searchElement("(//div[@class='XqNaEv'])[1]");
                Thread.sleep(2000);
                wrappers.clickElement(fourStar);

                Thread.sleep(5000);

                //mugProducts1
                WebElement mugProduct1=wrappers.searchElement("//div[@class='slAVV4']");
                WebElement img=wrappers.searchChildElement(mugProduct1, "./a/div/div/div[@class='_4WELSP']/img");
                System.out.println(img.getAttribute("src"));
                WebElement name=wrappers.searchChildElement(mugProduct1, "./a[2]");
                System.out.println(name.getText());

                //mugProducts2
                WebElement mugProducts2=wrappers.searchElement("(//div[@class='slAVV4'])[2]");
                WebElement img2=wrappers.searchChildElement(mugProducts2, "./a/div/div/div[@class='_4WELSP']/img");
                System.out.println(img2.getAttribute("src"));
                WebElement name2=wrappers.searchChildElement(mugProducts2, "./a[2]");
                System.out.println(name2.getText());

                //mugProducts3
                WebElement mugProducts3=wrappers.searchElement("(//div[@class='slAVV4'])[3]");
                WebElement img3=wrappers.searchChildElement(mugProducts3, "./a/div/div/div[@class='_4WELSP']/img");
                System.out.println(img3.getAttribute("src"));
                WebElement name3=wrappers.searchChildElement(mugProducts3, "./a[2]");
                System.out.println(name3.getText());

                //mugProducts4
                WebElement mugProducts4=wrappers.searchElement("(//div[@class='slAVV4'])[4]");
                WebElement img4=wrappers.searchChildElement(mugProducts4, "./a/div/div/div[@class='_4WELSP']/img");
                System.out.println(img4.getAttribute("src"));
                WebElement name4=wrappers.searchChildElement(mugProducts4, "./a[2]");
                System.out.println(name4.getText());

                //mugProducts5
                WebElement mugProducts5=wrappers.searchElement("(//div[@class='slAVV4'])[5]");
                WebElement img5=wrappers.searchChildElement(mugProducts5, "./a/div/div/div[@class='_4WELSP']/img");
                System.out.println(img4.getAttribute("src"));
                WebElement name5=wrappers.searchChildElement(mugProducts5, "./a[2]");
                System.out.println(name4.getText());

            
                Thread.sleep(5000);
                System.out.println("End Test case: testCase03");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("TestCase03 Failed!");
            }
        }

    /*
     * Do not change the provided methods unless necessary, they will help in
     * automation and assessment
     */
    @BeforeTest
    public void startBrowser() {
        System.setProperty("java.util.logging.config.file", "logging.properties");

        // NOT NEEDED FOR SELENIUM MANAGER
        // WebDriverManager.chromedriver().timeout(30).setup();

        ChromeOptions options = new ChromeOptions();
        LoggingPreferences logs = new LoggingPreferences();

        logs.enable(LogType.BROWSER, Level.ALL);
        logs.enable(LogType.DRIVER, Level.ALL);
        options.setCapability("goog:loggingPrefs", logs);
        options.addArguments("--remote-allow-origins=*");

        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "build/chromedriver.log");

        driver = new ChromeDriver(options);

        wrappers = new Wrappers(driver);

        driver.manage().window().maximize();
    }

    @AfterTest
    public void endTest() {
        driver.close();
        driver.quit();

    }
}

// //img
// WebElement img=wrappers.searchElement("//img[@title='Flipkart']");
// //click on img
// wrappers.clickElement(img);
// Thread.sleep(10000);

// WebElement cross=wrappers.searchElement("//span[@role='button']");
// wrappers.clickElement(cross);
// Thread.sleep(5000);

// //iphone
// WebElement newSearchbar=wrappers.searchElement("//input[@title='Search for
// Products, Brands and More']");
// //click icon search
// wrappers.sendInput(newSearchbar, "iPhone");
// Thread.sleep(1000);
// //SearchIcon
// WebElement newSearchIcon=wrappers.searchElement("//button[@title='Search for
// Products, Brands and More']");
// //click
// Thread.sleep(2000);
// wrappers.clickElement(newSearchIcon);

// Thread.sleep(5000);

// //iphoneTitle
// List<WebElement>
// iphoneTitle=wrappers.searchElements2("//div[@class='KzDlHZ']");
// for(WebElement title:iphoneTitle){
// System.out.println(title.getText());
// }
// //discount
// List<WebElement>
// discount=wrappers.searchElements2("//div[@class='UkUFwK']/span");
// for(WebElement discountIphone:discount){
// System.out.println(discountIphone.getText());
// }
// Thread.sleep(3000);

// //coffee mug
// WebElement newsuperSearchbar=wrappers.searchElement("//input[@title='Search
// for Products, Brands and More']");
// //click icon search
// wrappers.sendInput(newsuperSearchbar, "Coffee Mug");
// Thread.sleep(1000);
// //SearchIcon
// WebElement newSuperSearchIcon=wrappers.searchElement("//button[@title='Search
// for Products, Brands and More']");
// //click
// wrappers.clickElement(newSuperSearchIcon);